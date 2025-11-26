import antlr4 from 'antlr4';
import ChatLexer from './chatLexer.js';
import ChatParser from './chatParser.js';
import ChatListener  from './chatListener.js';

export default class HtmlChatListener extends ChatListener {    
    constructor(res) {
    super();
    this.Res = res;
  }
    
    enterColor(ctx) {     
    var color = ctx.WORD().getText();             
    ctx.text = '<span style="color: ' + color + '">';
}

exitColor(ctx) {
    ctx.text += ctx.message().text;    
    ctx.text += '</span>';
}

exitEmoticon(ctx) {      
    var emoticon = ctx.getText();        
    
    if(emoticon == ':-)' || emoticon == ':)')
    {        
        ctx.text = "🙂";
    }
    
    if(emoticon == ':-(' || emoticon == ':(')
    {          
        ctx.text = "🙁";
    }
}

exitMessage(ctx) {                
    var text = '';

    for (var index = 0; index <  ctx.children.length; index++ ) {
        if(ctx.children[index].text != null)
            text += ctx.children[index].text;
        else
            text += ctx.children[index].getText();
    }

    if(ctx.parentCtx instanceof ChatParser.LineContext == false)
    {
        ctx.text = text;        
    }    
    else
    {
        this.Res.write(text);
        this.Res.write("</p>");
    }
}
    
    enterCommand(ctx) {          
        if(ctx.SAYS() != null)
            this.Res.write(ctx.SAYS().getText() + ':' + '<p>');
    
        if(ctx.SHOUTS() != null)
            this.Res.write(ctx.SHOUTS().getText() + ':' + '<p style="text-transform: uppercase">');
    }

    exitLine(ctx) {              
  this.Res.write("</p>");
    }
}