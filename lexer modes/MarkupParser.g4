parser grammar MarkupParser;

options {tokenVocab=MarkupLexer ;}

file: element* EOF;

attribute: ID '=' STRING ;
content : TEXT ;
element : (content | tag ) ;

tag : '[' ID attribute? ']' element* '[' '/' ID ']' ;


