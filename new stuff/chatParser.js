// Generated from chat.g4 by ANTLR 4.13.2
// jshint ignore: start
import antlr4 from 'antlr4';
import chatListener from './chatListener.js';
const serializedATN = [4,1,12,71,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,
2,5,7,5,2,6,7,6,2,7,7,7,2,8,7,8,1,0,4,0,20,8,0,11,0,12,0,21,1,0,1,0,1,1,
1,1,1,1,1,1,1,2,1,2,1,2,1,2,1,2,1,2,3,2,36,8,2,1,3,1,3,1,3,1,4,1,4,1,4,1,
4,3,4,45,8,4,1,5,1,5,3,5,49,8,5,1,5,1,5,1,5,3,5,54,8,5,1,5,3,5,57,8,5,1,
6,1,6,1,6,1,7,1,7,1,7,1,7,1,7,1,7,1,8,1,8,1,8,1,8,0,0,9,0,2,4,6,8,10,12,
14,16,0,0,71,0,19,1,0,0,0,2,25,1,0,0,0,4,35,1,0,0,0,6,37,1,0,0,0,8,44,1,
0,0,0,10,56,1,0,0,0,12,58,1,0,0,0,14,61,1,0,0,0,16,67,1,0,0,0,18,20,3,2,
1,0,19,18,1,0,0,0,20,21,1,0,0,0,21,19,1,0,0,0,21,22,1,0,0,0,22,23,1,0,0,
0,23,24,5,0,0,1,24,1,1,0,0,0,25,26,3,6,3,0,26,27,3,8,4,0,27,28,5,11,0,0,
28,3,1,0,0,0,29,36,3,10,5,0,30,36,3,12,6,0,31,36,3,14,7,0,32,36,3,16,8,0,
33,36,5,9,0,0,34,36,5,10,0,0,35,29,1,0,0,0,35,30,1,0,0,0,35,31,1,0,0,0,35,
32,1,0,0,0,35,33,1,0,0,0,35,34,1,0,0,0,36,5,1,0,0,0,37,38,5,9,0,0,38,39,
5,10,0,0,39,7,1,0,0,0,40,45,5,7,0,0,41,42,5,8,0,0,42,43,5,1,0,0,43,45,5,
10,0,0,44,40,1,0,0,0,44,41,1,0,0,0,45,9,1,0,0,0,46,48,5,1,0,0,47,49,5,2,
0,0,48,47,1,0,0,0,48,49,1,0,0,0,49,50,1,0,0,0,50,57,5,3,0,0,51,53,5,1,0,
0,52,54,5,2,0,0,53,52,1,0,0,0,53,54,1,0,0,0,54,55,1,0,0,0,55,57,5,4,0,0,
56,46,1,0,0,0,56,51,1,0,0,0,57,11,1,0,0,0,58,59,5,12,0,0,59,60,5,12,0,0,
60,13,1,0,0,0,61,62,5,5,0,0,62,63,5,9,0,0,63,64,5,5,0,0,64,65,3,4,2,0,65,
66,5,5,0,0,66,15,1,0,0,0,67,68,5,6,0,0,68,69,5,9,0,0,69,17,1,0,0,0,6,21,
35,44,48,53,56];


const atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

const decisionsToDFA = atn.decisionToState.map( (ds, index) => new antlr4.dfa.DFA(ds, index) );

const sharedContextCache = new antlr4.atn.PredictionContextCache();

export default class chatParser extends antlr4.Parser {

    static grammarFileName = "chat.g4";
    static literalNames = [ null, "':'", "'-'", "')'", "'('", "'/'", "'@'" ];
    static symbolicNames = [ null, null, null, null, null, null, null, "SAYS", 
                             "SHOUTS", "WORD", "WHITESPACE", "NEWLINE", 
                             "TEXT" ];
    static ruleNames = [ "chat", "line", "message", "name", "command", "emoticon", 
                         "link", "color", "mention" ];

    constructor(input) {
        super(input);
        this._interp = new antlr4.atn.ParserATNSimulator(this, atn, decisionsToDFA, sharedContextCache);
        this.ruleNames = chatParser.ruleNames;
        this.literalNames = chatParser.literalNames;
        this.symbolicNames = chatParser.symbolicNames;
    }



	chat() {
	    let localctx = new ChatContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 0, chatParser.RULE_chat);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 19; 
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        do {
	            this.state = 18;
	            this.line();
	            this.state = 21; 
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        } while(_la===9);
	        this.state = 23;
	        this.match(chatParser.EOF);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	line() {
	    let localctx = new LineContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 2, chatParser.RULE_line);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 25;
	        this.name();
	        this.state = 26;
	        this.command();
	        this.state = 27;
	        this.match(chatParser.NEWLINE);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	message() {
	    let localctx = new MessageContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 4, chatParser.RULE_message);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 35;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case 1:
	            this.state = 29;
	            this.emoticon();
	            break;
	        case 12:
	            this.state = 30;
	            this.link();
	            break;
	        case 5:
	            this.state = 31;
	            this.color();
	            break;
	        case 6:
	            this.state = 32;
	            this.mention();
	            break;
	        case 9:
	            this.state = 33;
	            this.match(chatParser.WORD);
	            break;
	        case 10:
	            this.state = 34;
	            this.match(chatParser.WHITESPACE);
	            break;
	        default:
	            throw new antlr4.error.NoViableAltException(this);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	name() {
	    let localctx = new NameContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 6, chatParser.RULE_name);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 37;
	        this.match(chatParser.WORD);
	        this.state = 38;
	        this.match(chatParser.WHITESPACE);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	command() {
	    let localctx = new CommandContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 8, chatParser.RULE_command);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 44;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case 7:
	            this.state = 40;
	            this.match(chatParser.SAYS);
	            break;
	        case 8:
	            this.state = 41;
	            this.match(chatParser.SHOUTS);
	            this.state = 42;
	            this.match(chatParser.T__0);
	            this.state = 43;
	            this.match(chatParser.WHITESPACE);
	            break;
	        default:
	            throw new antlr4.error.NoViableAltException(this);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	emoticon() {
	    let localctx = new EmoticonContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 10, chatParser.RULE_emoticon);
	    var _la = 0;
	    try {
	        this.state = 56;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,5,this._ctx);
	        switch(la_) {
	        case 1:
	            this.enterOuterAlt(localctx, 1);
	            this.state = 46;
	            this.match(chatParser.T__0);
	            this.state = 48;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	            if(_la===2) {
	                this.state = 47;
	                this.match(chatParser.T__1);
	            }

	            this.state = 50;
	            this.match(chatParser.T__2);
	            break;

	        case 2:
	            this.enterOuterAlt(localctx, 2);
	            this.state = 51;
	            this.match(chatParser.T__0);
	            this.state = 53;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	            if(_la===2) {
	                this.state = 52;
	                this.match(chatParser.T__1);
	            }

	            this.state = 55;
	            this.match(chatParser.T__3);
	            break;

	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	link() {
	    let localctx = new LinkContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 12, chatParser.RULE_link);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 58;
	        this.match(chatParser.TEXT);
	        this.state = 59;
	        this.match(chatParser.TEXT);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	color() {
	    let localctx = new ColorContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 14, chatParser.RULE_color);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 61;
	        this.match(chatParser.T__4);
	        this.state = 62;
	        this.match(chatParser.WORD);
	        this.state = 63;
	        this.match(chatParser.T__4);
	        this.state = 64;
	        this.message();
	        this.state = 65;
	        this.match(chatParser.T__4);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	mention() {
	    let localctx = new MentionContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 16, chatParser.RULE_mention);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 67;
	        this.match(chatParser.T__5);
	        this.state = 68;
	        this.match(chatParser.WORD);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}


}

chatParser.EOF = antlr4.Token.EOF;
chatParser.T__0 = 1;
chatParser.T__1 = 2;
chatParser.T__2 = 3;
chatParser.T__3 = 4;
chatParser.T__4 = 5;
chatParser.T__5 = 6;
chatParser.SAYS = 7;
chatParser.SHOUTS = 8;
chatParser.WORD = 9;
chatParser.WHITESPACE = 10;
chatParser.NEWLINE = 11;
chatParser.TEXT = 12;

chatParser.RULE_chat = 0;
chatParser.RULE_line = 1;
chatParser.RULE_message = 2;
chatParser.RULE_name = 3;
chatParser.RULE_command = 4;
chatParser.RULE_emoticon = 5;
chatParser.RULE_link = 6;
chatParser.RULE_color = 7;
chatParser.RULE_mention = 8;

class ChatContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = chatParser.RULE_chat;
    }

	EOF() {
	    return this.getToken(chatParser.EOF, 0);
	};

	line = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(LineContext);
	    } else {
	        return this.getTypedRuleContext(LineContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof chatListener ) {
	        listener.enterChat(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof chatListener ) {
	        listener.exitChat(this);
		}
	}


}



class LineContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = chatParser.RULE_line;
    }

	name() {
	    return this.getTypedRuleContext(NameContext,0);
	};

	command() {
	    return this.getTypedRuleContext(CommandContext,0);
	};

	NEWLINE() {
	    return this.getToken(chatParser.NEWLINE, 0);
	};

	enterRule(listener) {
	    if(listener instanceof chatListener ) {
	        listener.enterLine(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof chatListener ) {
	        listener.exitLine(this);
		}
	}


}



class MessageContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = chatParser.RULE_message;
    }

	emoticon() {
	    return this.getTypedRuleContext(EmoticonContext,0);
	};

	link() {
	    return this.getTypedRuleContext(LinkContext,0);
	};

	color() {
	    return this.getTypedRuleContext(ColorContext,0);
	};

	mention() {
	    return this.getTypedRuleContext(MentionContext,0);
	};

	WORD() {
	    return this.getToken(chatParser.WORD, 0);
	};

	WHITESPACE() {
	    return this.getToken(chatParser.WHITESPACE, 0);
	};

	enterRule(listener) {
	    if(listener instanceof chatListener ) {
	        listener.enterMessage(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof chatListener ) {
	        listener.exitMessage(this);
		}
	}


}



class NameContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = chatParser.RULE_name;
    }

	WORD() {
	    return this.getToken(chatParser.WORD, 0);
	};

	WHITESPACE() {
	    return this.getToken(chatParser.WHITESPACE, 0);
	};

	enterRule(listener) {
	    if(listener instanceof chatListener ) {
	        listener.enterName(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof chatListener ) {
	        listener.exitName(this);
		}
	}


}



class CommandContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = chatParser.RULE_command;
    }

	SAYS() {
	    return this.getToken(chatParser.SAYS, 0);
	};

	SHOUTS() {
	    return this.getToken(chatParser.SHOUTS, 0);
	};

	WHITESPACE() {
	    return this.getToken(chatParser.WHITESPACE, 0);
	};

	enterRule(listener) {
	    if(listener instanceof chatListener ) {
	        listener.enterCommand(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof chatListener ) {
	        listener.exitCommand(this);
		}
	}


}



class EmoticonContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = chatParser.RULE_emoticon;
    }


	enterRule(listener) {
	    if(listener instanceof chatListener ) {
	        listener.enterEmoticon(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof chatListener ) {
	        listener.exitEmoticon(this);
		}
	}


}



class LinkContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = chatParser.RULE_link;
    }

	TEXT = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(chatParser.TEXT);
	    } else {
	        return this.getToken(chatParser.TEXT, i);
	    }
	};


	enterRule(listener) {
	    if(listener instanceof chatListener ) {
	        listener.enterLink(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof chatListener ) {
	        listener.exitLink(this);
		}
	}


}



class ColorContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = chatParser.RULE_color;
    }

	WORD() {
	    return this.getToken(chatParser.WORD, 0);
	};

	message() {
	    return this.getTypedRuleContext(MessageContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof chatListener ) {
	        listener.enterColor(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof chatListener ) {
	        listener.exitColor(this);
		}
	}


}



class MentionContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = chatParser.RULE_mention;
    }

	WORD() {
	    return this.getToken(chatParser.WORD, 0);
	};

	enterRule(listener) {
	    if(listener instanceof chatListener ) {
	        listener.enterMention(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof chatListener ) {
	        listener.exitMention(this);
		}
	}


}




chatParser.ChatContext = ChatContext; 
chatParser.LineContext = LineContext; 
chatParser.MessageContext = MessageContext; 
chatParser.NameContext = NameContext; 
chatParser.CommandContext = CommandContext; 
chatParser.EmoticonContext = EmoticonContext; 
chatParser.LinkContext = LinkContext; 
chatParser.ColorContext = ColorContext; 
chatParser.MentionContext = MentionContext; 
