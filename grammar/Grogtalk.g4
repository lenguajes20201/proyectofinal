grammar Grogtalk;

@members{
    int abilityCount;
}

creature: L_BRACKET creature_body R_BRACKET;
creature_body: statistic (COMMA statistic)*;
statistic
            : name
            | size
            | type
            | tags
            | alignment
            | armor_class
            | hitpoints
            | speed
            | abilities
            | senses
            | saving_throws
            | skills
            | damage_immunities
            | damage_resistances
            | damage_vulnerabilities
            | condition_immunities
            | languages
            | challenge
            | special_traits
            | actions
            | reactions
            | legendary_actions
            ;
// stats grammar rules
name: K_NAME COLON common_expr; //Done
size: K_SIZE COLON common_expr; //Done
type: K_TYPE COLON common_expr; //Done
tags: K_TAGS COLON taglist;  //Done
alignment: K_ALIGNMENT COLON common_expr; //Done
armor_class: K_ARMORCLASS COLON common_expr; //Done
hitpoints: K_HITPOINTS COLON hit_points_expr; //Done
speed: K_SPEED COLON common_expr; //Done
abilities //Done
@init{ abilityCount = 0; }
:K_ABILITIES COLON L_SPAR ability_expr (COMMA ability_expr { abilityCount++; } )+ R_SPAR { abilityCount == 5 }?;
senses: K_SENSES COLON common_expr; //Done
saving_throws: K_SAVINGTHROW common_expr; //Done
skills: K_SKILLS common_expr; //Done
damage_immunities: K_DAMIM COLON common_expr; //Done
damage_resistances: K_DAMRES COLON common_expr; //Done
damage_vulnerabilities: K_DAMVUL COLON common_expr; //Done
condition_immunities: K_CONDIM COLON common_expr; //Done
languages: K_LANGS COLON common_expr; //Done
challenge: K_CHALLENGE COLON common_expr; //Done
special_traits: K_SPECIALTRAITS COLON common_expr; //Done
actions:K_ACTIONS COLON action_obj; //Done
reactions:K_REACTIONS COLON action_obj; //Done
legendary_actions:K_L_ACTIONS COLON action_obj; //Done



// auxilliary stat grammar rules
taglist: L_SPAR STRING (COMMA STRING)* R_SPAR; //Done
ability_expr: INT L_PAR modifier R_PAR;  //Done
dice_expr : INT ('d'|'D') INT (modifier)?; //DOne
armor_class_expr: INT (L_PAR STRING R_PAR)?;
hit_points_expr: (INT  L_PAR dice_expr R_PAR) | dice_expr;  //Done
common_expr: STRING;  //Done
action_obj: L_BRACKET action_expr (COMMA action_expr)* R_BRACKET; //Done
action_expr: key COLON value; //Done
key: STRING; //Done
value: STRING; //Done
speed_expr: STRING;
modifier: (PLUS | MINUS) INT; //Done


// tokens
L_BRACKET: '{';
R_BRACKET: '}';
L_SPAR: '[';
R_SPAR: ']';
L_PAR: '(';
R_PAR: ')';
COMMA: ',';
COLON: ':';
PLUS: '+';
MINUS: '-';
STRING: '"' ( ~["] )* '"';


K_NAME: N A M E;
K_SIZE: S I Z E;
K_TYPE: T Y P E;
K_TAGS: ((T A G S) | (T A G));
K_ALIGNMENT: A L I G N M E N T;
K_ARMORCLASS: ((A R M O R C L A S S) | (A C));
K_HITPOINTS: ((H I T P O I N T S) | (H P));
K_SPEED: S P E E D;
K_SENSES: S E N S E S;
K_ABILITIES: A B I L I T I E S;
K_SAVINGTHROW: (S A V I N G T H R O W S)|(S A V I N G T H R O W)|(S T);
K_SKILLS: S K I L L S;
K_DAMIM: D A M A G E I M M U N I T I E S;
K_DAMRES: D A M A G E R E S I S T A N C E S;
K_DAMVUL: D A M A G E V U L N E R A B I L I E S;
K_CONDIM: C O N D I T I O N I M M U N I T I E S;
K_LANGS: L A N G U A G E S;
K_CHALLENGE: (C H A L L E N G E)|(C H A L L E N G E R A T I N G)|(C R);
K_SPECIALTRAITS: S P E C I A L T R A I T S;
K_ACTIONS: A C T I O N S;
K_REACTIONS: R E A C T I O N S;
K_L_ACTIONS: L E G E N D A R Y A C T I O N S;

WS: [ \t\n\r] + -> skip;


INT: '0' | [1-9] [0-9]*;

// these rules make the language case insensitive
fragment A : [aA]; // match either an 'a' or 'A'
fragment B : [bB];
fragment C : [cC];
fragment D : [dD];
fragment E : [eE];
fragment F : [fF];
fragment G : [gG];
fragment H : [hH];
fragment I : [iI];
fragment J : [jJ];
fragment K : [kK];
fragment L : [lL];
fragment M : [mM];
fragment N : [nN];
fragment O : [oO];
fragment P : [pP];
fragment Q : [qQ];
fragment R : [rR];
fragment S : [sS];
fragment T : [tT];
fragment U : [uU];
fragment V : [vV];
fragment W : [wW];
fragment X : [xX];
fragment Y : [yY];
fragment Z : [zZ];