// Generated from D:/Users/ACER/Documents/2020-1_SEMESTRE_9/Lenguajes de programacion/proyectofinal/grammar\Grogtalk.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrogtalkParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, L_BRACKET=3, R_BRACKET=4, L_SPAR=5, R_SPAR=6, L_PAR=7, 
		R_PAR=8, COMMA=9, COLON=10, PLUS=11, MINUS=12, STRING=13, K_NAME=14, K_SIZE=15, 
		K_TYPE=16, K_TAGS=17, K_ALIGNMENT=18, K_ARMORCLASS=19, K_HITPOINTS=20, 
		K_SPEED=21, K_SENSES=22, K_ABILITIES=23, K_SAVINGTHROW=24, K_SKILLS=25, 
		K_DAMIM=26, K_DAMRES=27, K_DAMVUL=28, K_CONDIM=29, K_LANGS=30, K_CHALLENGE=31, 
		K_SPECIALTRAITS=32, K_ACTIONS=33, K_REACTIONS=34, K_L_ACTIONS=35, WS=36, 
		INT=37;
	public static final int
		RULE_creature = 0, RULE_creature_body = 1, RULE_statistic = 2, RULE_name = 3, 
		RULE_size = 4, RULE_type = 5, RULE_tags = 6, RULE_alignment = 7, RULE_armor_class = 8, 
		RULE_hitpoints = 9, RULE_speed = 10, RULE_abilities = 11, RULE_senses = 12, 
		RULE_saving_throws = 13, RULE_skills = 14, RULE_damage_immunities = 15, 
		RULE_damage_resistances = 16, RULE_damage_vulnerabilities = 17, RULE_condition_immunities = 18, 
		RULE_languages = 19, RULE_challenge = 20, RULE_special_traits = 21, RULE_actions = 22, 
		RULE_reactions = 23, RULE_legendary_actions = 24, RULE_taglist = 25, RULE_ability_expr = 26, 
		RULE_dice_expr = 27, RULE_armor_class_expr = 28, RULE_hit_points_expr = 29, 
		RULE_common_expr = 30, RULE_action_obj = 31, RULE_action_expr = 32, RULE_key = 33, 
		RULE_value = 34, RULE_speed_expr = 35, RULE_modifier = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"creature", "creature_body", "statistic", "name", "size", "type", "tags", 
			"alignment", "armor_class", "hitpoints", "speed", "abilities", "senses", 
			"saving_throws", "skills", "damage_immunities", "damage_resistances", 
			"damage_vulnerabilities", "condition_immunities", "languages", "challenge", 
			"special_traits", "actions", "reactions", "legendary_actions", "taglist", 
			"ability_expr", "dice_expr", "armor_class_expr", "hit_points_expr", "common_expr", 
			"action_obj", "action_expr", "key", "value", "speed_expr", "modifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'d'", "'D'", "'{'", "'}'", "'['", "']'", "'('", "')'", "','", 
			"':'", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "L_BRACKET", "R_BRACKET", "L_SPAR", "R_SPAR", "L_PAR", 
			"R_PAR", "COMMA", "COLON", "PLUS", "MINUS", "STRING", "K_NAME", "K_SIZE", 
			"K_TYPE", "K_TAGS", "K_ALIGNMENT", "K_ARMORCLASS", "K_HITPOINTS", "K_SPEED", 
			"K_SENSES", "K_ABILITIES", "K_SAVINGTHROW", "K_SKILLS", "K_DAMIM", "K_DAMRES", 
			"K_DAMVUL", "K_CONDIM", "K_LANGS", "K_CHALLENGE", "K_SPECIALTRAITS", 
			"K_ACTIONS", "K_REACTIONS", "K_L_ACTIONS", "WS", "INT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Grogtalk.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    int abilityCount;

	public GrogtalkParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CreatureContext extends ParserRuleContext {
		public TerminalNode L_BRACKET() { return getToken(GrogtalkParser.L_BRACKET, 0); }
		public Creature_bodyContext creature_body() {
			return getRuleContext(Creature_bodyContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(GrogtalkParser.R_BRACKET, 0); }
		public CreatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).enterCreature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).exitCreature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrogtalkVisitor ) return ((GrogtalkVisitor<? extends T>)visitor).visitCreature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatureContext creature() throws RecognitionException {
		CreatureContext _localctx = new CreatureContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_creature);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(L_BRACKET);
			setState(75);
			creature_body();
			setState(76);
			match(R_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Creature_bodyContext extends ParserRuleContext {
		public List<StatisticContext> statistic() {
			return getRuleContexts(StatisticContext.class);
		}
		public StatisticContext statistic(int i) {
			return getRuleContext(StatisticContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GrogtalkParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrogtalkParser.COMMA, i);
		}
		public Creature_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creature_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).enterCreature_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).exitCreature_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrogtalkVisitor ) return ((GrogtalkVisitor<? extends T>)visitor).visitCreature_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Creature_bodyContext creature_body() throws RecognitionException {
		Creature_bodyContext _localctx = new Creature_bodyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_creature_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			statistic();
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(79);
				match(COMMA);
				setState(80);
				statistic();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatisticContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public SizeContext size() {
			return getRuleContext(SizeContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TagsContext tags() {
			return getRuleContext(TagsContext.class,0);
		}
		public AlignmentContext alignment() {
			return getRuleContext(AlignmentContext.class,0);
		}
		public Armor_classContext armor_class() {
			return getRuleContext(Armor_classContext.class,0);
		}
		public HitpointsContext hitpoints() {
			return getRuleContext(HitpointsContext.class,0);
		}
		public SpeedContext speed() {
			return getRuleContext(SpeedContext.class,0);
		}
		public AbilitiesContext abilities() {
			return getRuleContext(AbilitiesContext.class,0);
		}
		public SensesContext senses() {
			return getRuleContext(SensesContext.class,0);
		}
		public Saving_throwsContext saving_throws() {
			return getRuleContext(Saving_throwsContext.class,0);
		}
		public SkillsContext skills() {
			return getRuleContext(SkillsContext.class,0);
		}
		public Damage_immunitiesContext damage_immunities() {
			return getRuleContext(Damage_immunitiesContext.class,0);
		}
		public Damage_resistancesContext damage_resistances() {
			return getRuleContext(Damage_resistancesContext.class,0);
		}
		public Damage_vulnerabilitiesContext damage_vulnerabilities() {
			return getRuleContext(Damage_vulnerabilitiesContext.class,0);
		}
		public Condition_immunitiesContext condition_immunities() {
			return getRuleContext(Condition_immunitiesContext.class,0);
		}
		public LanguagesContext languages() {
			return getRuleContext(LanguagesContext.class,0);
		}
		public ChallengeContext challenge() {
			return getRuleContext(ChallengeContext.class,0);
		}
		public Special_traitsContext special_traits() {
			return getRuleContext(Special_traitsContext.class,0);
		}
		public ActionsContext actions() {
			return getRuleContext(ActionsContext.class,0);
		}
		public ReactionsContext reactions() {
			return getRuleContext(ReactionsContext.class,0);
		}
		public Legendary_actionsContext legendary_actions() {
			return getRuleContext(Legendary_actionsContext.class,0);
		}
		public StatisticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statistic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).enterStatistic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).exitStatistic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrogtalkVisitor ) return ((GrogtalkVisitor<? extends T>)visitor).visitStatistic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatisticContext statistic() throws RecognitionException {
		StatisticContext _localctx = new StatisticContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statistic);
		try {
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				name();
				}
				break;
			case K_SIZE:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				size();
				}
				break;
			case K_TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				type();
				}
				break;
			case K_TAGS:
				enterOuterAlt(_localctx, 4);
				{
				setState(89);
				tags();
				}
				break;
			case K_ALIGNMENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(90);
				alignment();
				}
				break;
			case K_ARMORCLASS:
				enterOuterAlt(_localctx, 6);
				{
				setState(91);
				armor_class();
				}
				break;
			case K_HITPOINTS:
				enterOuterAlt(_localctx, 7);
				{
				setState(92);
				hitpoints();
				}
				break;
			case K_SPEED:
				enterOuterAlt(_localctx, 8);
				{
				setState(93);
				speed();
				}
				break;
			case K_ABILITIES:
				enterOuterAlt(_localctx, 9);
				{
				setState(94);
				abilities();
				}
				break;
			case K_SENSES:
				enterOuterAlt(_localctx, 10);
				{
				setState(95);
				senses();
				}
				break;
			case K_SAVINGTHROW:
				enterOuterAlt(_localctx, 11);
				{
				setState(96);
				saving_throws();
				}
				break;
			case K_SKILLS:
				enterOuterAlt(_localctx, 12);
				{
				setState(97);
				skills();
				}
				break;
			case K_DAMIM:
				enterOuterAlt(_localctx, 13);
				{
				setState(98);
				damage_immunities();
				}
				break;
			case K_DAMRES:
				enterOuterAlt(_localctx, 14);
				{
				setState(99);
				damage_resistances();
				}
				break;
			case K_DAMVUL:
				enterOuterAlt(_localctx, 15);
				{
				setState(100);
				damage_vulnerabilities();
				}
				break;
			case K_CONDIM:
				enterOuterAlt(_localctx, 16);
				{
				setState(101);
				condition_immunities();
				}
				break;
			case K_LANGS:
				enterOuterAlt(_localctx, 17);
				{
				setState(102);
				languages();
				}
				break;
			case K_CHALLENGE:
				enterOuterAlt(_localctx, 18);
				{
				setState(103);
				challenge();
				}
				break;
			case K_SPECIALTRAITS:
				enterOuterAlt(_localctx, 19);
				{
				setState(104);
				special_traits();
				}
				break;
			case K_ACTIONS:
				enterOuterAlt(_localctx, 20);
				{
				setState(105);
				actions();
				}
				break;
			case K_REACTIONS:
				enterOuterAlt(_localctx, 21);
				{
				setState(106);
				reactions();
				}
				break;
			case K_L_ACTIONS:
				enterOuterAlt(_localctx, 22);
				{
				setState(107);
				legendary_actions();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public TerminalNode K_NAME() { return getToken(GrogtalkParser.K_NAME, 0); }
		public TerminalNode COLON() { return getToken(GrogtalkParser.COLON, 0); }
		public Common_exprContext common_expr() {
			return getRuleContext(Common_exprContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrogtalkVisitor ) return ((GrogtalkVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(K_NAME);
			setState(111);
			match(COLON);
			setState(112);
			common_expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SizeContext extends ParserRuleContext {
		public TerminalNode K_SIZE() { return getToken(GrogtalkParser.K_SIZE, 0); }
		public TerminalNode COLON() { return getToken(GrogtalkParser.COLON, 0); }
		public Common_exprContext common_expr() {
			return getRuleContext(Common_exprContext.class,0);
		}
		public SizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_size; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).enterSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).exitSize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrogtalkVisitor ) return ((GrogtalkVisitor<? extends T>)visitor).visitSize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SizeContext size() throws RecognitionException {
		SizeContext _localctx = new SizeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_size);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(K_SIZE);
			setState(115);
			match(COLON);
			setState(116);
			common_expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode K_TYPE() { return getToken(GrogtalkParser.K_TYPE, 0); }
		public TerminalNode COLON() { return getToken(GrogtalkParser.COLON, 0); }
		public Common_exprContext common_expr() {
			return getRuleContext(Common_exprContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrogtalkVisitor ) return ((GrogtalkVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(K_TYPE);
			setState(119);
			match(COLON);
			setState(120);
			common_expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TagsContext extends ParserRuleContext {
		public TerminalNode K_TAGS() { return getToken(GrogtalkParser.K_TAGS, 0); }
		public TerminalNode COLON() { return getToken(GrogtalkParser.COLON, 0); }
		public TaglistContext taglist() {
			return getRuleContext(TaglistContext.class,0);
		}
		public TagsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tags; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).enterTags(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).exitTags(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrogtalkVisitor ) return ((GrogtalkVisitor<? extends T>)visitor).visitTags(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagsContext tags() throws RecognitionException {
		TagsContext _localctx = new TagsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tags);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(K_TAGS);
			setState(123);
			match(COLON);
			setState(124);
			taglist();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlignmentContext extends ParserRuleContext {
		public TerminalNode K_ALIGNMENT() { return getToken(GrogtalkParser.K_ALIGNMENT, 0); }
		public TerminalNode COLON() { return getToken(GrogtalkParser.COLON, 0); }
		public Common_exprContext common_expr() {
			return getRuleContext(Common_exprContext.class,0);
		}
		public AlignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).enterAlignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).exitAlignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrogtalkVisitor ) return ((GrogtalkVisitor<? extends T>)visitor).visitAlignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlignmentContext alignment() throws RecognitionException {
		AlignmentContext _localctx = new AlignmentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_alignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(K_ALIGNMENT);
			setState(127);
			match(COLON);
			setState(128);
			common_expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Armor_classContext extends ParserRuleContext {
		public TerminalNode K_ARMORCLASS() { return getToken(GrogtalkParser.K_ARMORCLASS, 0); }
		public TerminalNode COLON() { return getToken(GrogtalkParser.COLON, 0); }
		public Common_exprContext common_expr() {
			return getRuleContext(Common_exprContext.class,0);
		}
		public Armor_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_armor_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).enterArmor_class(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).exitArmor_class(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrogtalkVisitor ) return ((GrogtalkVisitor<? extends T>)visitor).visitArmor_class(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Armor_classContext armor_class() throws RecognitionException {
		Armor_classContext _localctx = new Armor_classContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_armor_class);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(K_ARMORCLASS);
			setState(131);
			match(COLON);
			setState(132);
			common_expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HitpointsContext extends ParserRuleContext {
		public TerminalNode K_HITPOINTS() { return getToken(GrogtalkParser.K_HITPOINTS, 0); }
		public TerminalNode COLON() { return getToken(GrogtalkParser.COLON, 0); }
		public Hit_points_exprContext hit_points_expr() {
			return getRuleContext(Hit_points_exprContext.class,0);
		}
		public HitpointsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hitpoints; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).enterHitpoints(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).exitHitpoints(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrogtalkVisitor ) return ((GrogtalkVisitor<? extends T>)visitor).visitHitpoints(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HitpointsContext hitpoints() throws RecognitionException {
		HitpointsContext _localctx = new HitpointsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_hitpoints);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(K_HITPOINTS);
			setState(135);
			match(COLON);
			setState(136);
			hit_points_expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpeedContext extends ParserRuleContext {
		public TerminalNode K_SPEED() { return getToken(GrogtalkParser.K_SPEED, 0); }
		public TerminalNode COLON() { return getToken(GrogtalkParser.COLON, 0); }
		public Common_exprContext common_expr() {
			return getRuleContext(Common_exprContext.class,0);
		}
		public SpeedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_speed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).enterSpeed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).exitSpeed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrogtalkVisitor ) return ((GrogtalkVisitor<? extends T>)visitor).visitSpeed(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpeedContext speed() throws RecognitionException {
		SpeedContext _localctx = new SpeedContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_speed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(K_SPEED);
			setState(139);
			match(COLON);
			setState(140);
			common_expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbilitiesContext extends ParserRuleContext {
		public TerminalNode K_ABILITIES() { return getToken(GrogtalkParser.K_ABILITIES, 0); }
		public TerminalNode COLON() { return getToken(GrogtalkParser.COLON, 0); }
		public TerminalNode L_SPAR() { return getToken(GrogtalkParser.L_SPAR, 0); }
		public List<Ability_exprContext> ability_expr() {
			return getRuleContexts(Ability_exprContext.class);
		}
		public Ability_exprContext ability_expr(int i) {
			return getRuleContext(Ability_exprContext.class,i);
		}
		public TerminalNode R_SPAR() { return getToken(GrogtalkParser.R_SPAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GrogtalkParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrogtalkParser.COMMA, i);
		}
		public AbilitiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abilities; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).enterAbilities(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).exitAbilities(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrogtalkVisitor ) return ((GrogtalkVisitor<? extends T>)visitor).visitAbilities(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbilitiesContext abilities() throws RecognitionException {
		AbilitiesContext _localctx = new AbilitiesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_abilities);
		 abilityCount = 0; 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(K_ABILITIES);
			setState(143);
			match(COLON);
			setState(144);
			match(L_SPAR);
			setState(145);
			ability_expr();
			setState(150); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(146);
				match(COMMA);
				setState(147);
				ability_expr();
				 abilityCount++; 
				}
				}
				setState(152); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMMA );
			setState(154);
			match(R_SPAR);
			setState(155);
			if (!( abilityCount == 5 )) throw new FailedPredicateException(this, " abilityCount == 5 ");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SensesContext extends ParserRuleContext {
		public TerminalNode K_SENSES() { return getToken(GrogtalkParser.K_SENSES, 0); }
		public TerminalNode COLON() { return getToken(GrogtalkParser.COLON, 0); }
		public Common_exprContext common_expr() {
			return getRuleContext(Common_exprContext.class,0);
		}
		public SensesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_senses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).enterSenses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).exitSenses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrogtalkVisitor ) return ((GrogtalkVisitor<? extends T>)visitor).visitSenses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SensesContext senses() throws RecognitionException {
		SensesContext _localctx = new SensesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_senses);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(K_SENSES);
			setState(158);
			match(COLON);
			setState(159);
			common_expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Saving_throwsContext extends ParserRuleContext {
		public TerminalNode K_SAVINGTHROW() { return getToken(GrogtalkParser.K_SAVINGTHROW, 0); }
		public Common_exprContext common_expr() {
			return getRuleContext(Common_exprContext.class,0);
		}
		public Saving_throwsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_saving_throws; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).enterSaving_throws(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).exitSaving_throws(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrogtalkVisitor ) return ((GrogtalkVisitor<? extends T>)visitor).visitSaving_throws(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Saving_throwsContext saving_throws() throws RecognitionException {
		Saving_throwsContext _localctx = new Saving_throwsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_saving_throws);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(K_SAVINGTHROW);
			setState(162);
			common_expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SkillsContext extends ParserRuleContext {
		public TerminalNode K_SKILLS() { return getToken(GrogtalkParser.K_SKILLS, 0); }
		public Common_exprContext common_expr() {
			return getRuleContext(Common_exprContext.class,0);
		}
		public SkillsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skills; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).enterSkills(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).exitSkills(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrogtalkVisitor ) return ((GrogtalkVisitor<? extends T>)visitor).visitSkills(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SkillsContext skills() throws RecognitionException {
		SkillsContext _localctx = new SkillsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_skills);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(K_SKILLS);
			setState(165);
			common_expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Damage_immunitiesContext extends ParserRuleContext {
		public TerminalNode K_DAMIM() { return getToken(GrogtalkParser.K_DAMIM, 0); }
		public TerminalNode COLON() { return getToken(GrogtalkParser.COLON, 0); }
		public Common_exprContext common_expr() {
			return getRuleContext(Common_exprContext.class,0);
		}
		public Damage_immunitiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_damage_immunities; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).enterDamage_immunities(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).exitDamage_immunities(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrogtalkVisitor ) return ((GrogtalkVisitor<? extends T>)visitor).visitDamage_immunities(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Damage_immunitiesContext damage_immunities() throws RecognitionException {
		Damage_immunitiesContext _localctx = new Damage_immunitiesContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_damage_immunities);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(K_DAMIM);
			setState(168);
			match(COLON);
			setState(169);
			common_expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Damage_resistancesContext extends ParserRuleContext {
		public TerminalNode K_DAMRES() { return getToken(GrogtalkParser.K_DAMRES, 0); }
		public TerminalNode COLON() { return getToken(GrogtalkParser.COLON, 0); }
		public Common_exprContext common_expr() {
			return getRuleContext(Common_exprContext.class,0);
		}
		public Damage_resistancesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_damage_resistances; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).enterDamage_resistances(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).exitDamage_resistances(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrogtalkVisitor ) return ((GrogtalkVisitor<? extends T>)visitor).visitDamage_resistances(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Damage_resistancesContext damage_resistances() throws RecognitionException {
		Damage_resistancesContext _localctx = new Damage_resistancesContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_damage_resistances);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(K_DAMRES);
			setState(172);
			match(COLON);
			setState(173);
			common_expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Damage_vulnerabilitiesContext extends ParserRuleContext {
		public TerminalNode K_DAMVUL() { return getToken(GrogtalkParser.K_DAMVUL, 0); }
		public TerminalNode COLON() { return getToken(GrogtalkParser.COLON, 0); }
		public Common_exprContext common_expr() {
			return getRuleContext(Common_exprContext.class,0);
		}
		public Damage_vulnerabilitiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_damage_vulnerabilities; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).enterDamage_vulnerabilities(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).exitDamage_vulnerabilities(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrogtalkVisitor ) return ((GrogtalkVisitor<? extends T>)visitor).visitDamage_vulnerabilities(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Damage_vulnerabilitiesContext damage_vulnerabilities() throws RecognitionException {
		Damage_vulnerabilitiesContext _localctx = new Damage_vulnerabilitiesContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_damage_vulnerabilities);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(K_DAMVUL);
			setState(176);
			match(COLON);
			setState(177);
			common_expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Condition_immunitiesContext extends ParserRuleContext {
		public TerminalNode K_CONDIM() { return getToken(GrogtalkParser.K_CONDIM, 0); }
		public TerminalNode COLON() { return getToken(GrogtalkParser.COLON, 0); }
		public Common_exprContext common_expr() {
			return getRuleContext(Common_exprContext.class,0);
		}
		public Condition_immunitiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_immunities; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).enterCondition_immunities(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).exitCondition_immunities(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrogtalkVisitor ) return ((GrogtalkVisitor<? extends T>)visitor).visitCondition_immunities(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_immunitiesContext condition_immunities() throws RecognitionException {
		Condition_immunitiesContext _localctx = new Condition_immunitiesContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_condition_immunities);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(K_CONDIM);
			setState(180);
			match(COLON);
			setState(181);
			common_expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LanguagesContext extends ParserRuleContext {
		public TerminalNode K_LANGS() { return getToken(GrogtalkParser.K_LANGS, 0); }
		public TerminalNode COLON() { return getToken(GrogtalkParser.COLON, 0); }
		public Common_exprContext common_expr() {
			return getRuleContext(Common_exprContext.class,0);
		}
		public LanguagesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_languages; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).enterLanguages(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).exitLanguages(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrogtalkVisitor ) return ((GrogtalkVisitor<? extends T>)visitor).visitLanguages(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LanguagesContext languages() throws RecognitionException {
		LanguagesContext _localctx = new LanguagesContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_languages);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(K_LANGS);
			setState(184);
			match(COLON);
			setState(185);
			common_expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChallengeContext extends ParserRuleContext {
		public TerminalNode K_CHALLENGE() { return getToken(GrogtalkParser.K_CHALLENGE, 0); }
		public TerminalNode COLON() { return getToken(GrogtalkParser.COLON, 0); }
		public Common_exprContext common_expr() {
			return getRuleContext(Common_exprContext.class,0);
		}
		public ChallengeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_challenge; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).enterChallenge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).exitChallenge(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrogtalkVisitor ) return ((GrogtalkVisitor<? extends T>)visitor).visitChallenge(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChallengeContext challenge() throws RecognitionException {
		ChallengeContext _localctx = new ChallengeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_challenge);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(K_CHALLENGE);
			setState(188);
			match(COLON);
			setState(189);
			common_expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Special_traitsContext extends ParserRuleContext {
		public TerminalNode K_SPECIALTRAITS() { return getToken(GrogtalkParser.K_SPECIALTRAITS, 0); }
		public TerminalNode COLON() { return getToken(GrogtalkParser.COLON, 0); }
		public Common_exprContext common_expr() {
			return getRuleContext(Common_exprContext.class,0);
		}
		public Special_traitsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_special_traits; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).enterSpecial_traits(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).exitSpecial_traits(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrogtalkVisitor ) return ((GrogtalkVisitor<? extends T>)visitor).visitSpecial_traits(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Special_traitsContext special_traits() throws RecognitionException {
		Special_traitsContext _localctx = new Special_traitsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_special_traits);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(K_SPECIALTRAITS);
			setState(192);
			match(COLON);
			setState(193);
			common_expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActionsContext extends ParserRuleContext {
		public TerminalNode K_ACTIONS() { return getToken(GrogtalkParser.K_ACTIONS, 0); }
		public TerminalNode COLON() { return getToken(GrogtalkParser.COLON, 0); }
		public Action_objContext action_obj() {
			return getRuleContext(Action_objContext.class,0);
		}
		public ActionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).enterActions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).exitActions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrogtalkVisitor ) return ((GrogtalkVisitor<? extends T>)visitor).visitActions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionsContext actions() throws RecognitionException {
		ActionsContext _localctx = new ActionsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_actions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(K_ACTIONS);
			setState(196);
			match(COLON);
			setState(197);
			action_obj();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReactionsContext extends ParserRuleContext {
		public TerminalNode K_REACTIONS() { return getToken(GrogtalkParser.K_REACTIONS, 0); }
		public TerminalNode COLON() { return getToken(GrogtalkParser.COLON, 0); }
		public Action_objContext action_obj() {
			return getRuleContext(Action_objContext.class,0);
		}
		public ReactionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reactions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).enterReactions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).exitReactions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrogtalkVisitor ) return ((GrogtalkVisitor<? extends T>)visitor).visitReactions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReactionsContext reactions() throws RecognitionException {
		ReactionsContext _localctx = new ReactionsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_reactions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(K_REACTIONS);
			setState(200);
			match(COLON);
			setState(201);
			action_obj();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Legendary_actionsContext extends ParserRuleContext {
		public TerminalNode K_L_ACTIONS() { return getToken(GrogtalkParser.K_L_ACTIONS, 0); }
		public TerminalNode COLON() { return getToken(GrogtalkParser.COLON, 0); }
		public Action_objContext action_obj() {
			return getRuleContext(Action_objContext.class,0);
		}
		public Legendary_actionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_legendary_actions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).enterLegendary_actions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).exitLegendary_actions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrogtalkVisitor ) return ((GrogtalkVisitor<? extends T>)visitor).visitLegendary_actions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Legendary_actionsContext legendary_actions() throws RecognitionException {
		Legendary_actionsContext _localctx = new Legendary_actionsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_legendary_actions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(K_L_ACTIONS);
			setState(204);
			match(COLON);
			setState(205);
			action_obj();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TaglistContext extends ParserRuleContext {
		public TerminalNode L_SPAR() { return getToken(GrogtalkParser.L_SPAR, 0); }
		public List<TerminalNode> STRING() { return getTokens(GrogtalkParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(GrogtalkParser.STRING, i);
		}
		public TerminalNode R_SPAR() { return getToken(GrogtalkParser.R_SPAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GrogtalkParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrogtalkParser.COMMA, i);
		}
		public TaglistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_taglist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).enterTaglist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).exitTaglist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrogtalkVisitor ) return ((GrogtalkVisitor<? extends T>)visitor).visitTaglist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TaglistContext taglist() throws RecognitionException {
		TaglistContext _localctx = new TaglistContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_taglist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(L_SPAR);
			setState(208);
			match(STRING);
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(209);
				match(COMMA);
				setState(210);
				match(STRING);
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(216);
			match(R_SPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ability_exprContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GrogtalkParser.INT, 0); }
		public TerminalNode L_PAR() { return getToken(GrogtalkParser.L_PAR, 0); }
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public TerminalNode R_PAR() { return getToken(GrogtalkParser.R_PAR, 0); }
		public Ability_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ability_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).enterAbility_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).exitAbility_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrogtalkVisitor ) return ((GrogtalkVisitor<? extends T>)visitor).visitAbility_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ability_exprContext ability_expr() throws RecognitionException {
		Ability_exprContext _localctx = new Ability_exprContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_ability_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(INT);
			setState(219);
			match(L_PAR);
			setState(220);
			modifier();
			setState(221);
			match(R_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dice_exprContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(GrogtalkParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(GrogtalkParser.INT, i);
		}
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public Dice_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dice_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).enterDice_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).exitDice_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrogtalkVisitor ) return ((GrogtalkVisitor<? extends T>)visitor).visitDice_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dice_exprContext dice_expr() throws RecognitionException {
		Dice_exprContext _localctx = new Dice_exprContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_dice_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(INT);
			setState(224);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(225);
			match(INT);
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(226);
				modifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Armor_class_exprContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GrogtalkParser.INT, 0); }
		public TerminalNode L_PAR() { return getToken(GrogtalkParser.L_PAR, 0); }
		public TerminalNode STRING() { return getToken(GrogtalkParser.STRING, 0); }
		public TerminalNode R_PAR() { return getToken(GrogtalkParser.R_PAR, 0); }
		public Armor_class_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_armor_class_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).enterArmor_class_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).exitArmor_class_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrogtalkVisitor ) return ((GrogtalkVisitor<? extends T>)visitor).visitArmor_class_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Armor_class_exprContext armor_class_expr() throws RecognitionException {
		Armor_class_exprContext _localctx = new Armor_class_exprContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_armor_class_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(INT);
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==L_PAR) {
				{
				setState(230);
				match(L_PAR);
				setState(231);
				match(STRING);
				setState(232);
				match(R_PAR);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Hit_points_exprContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GrogtalkParser.INT, 0); }
		public TerminalNode L_PAR() { return getToken(GrogtalkParser.L_PAR, 0); }
		public Dice_exprContext dice_expr() {
			return getRuleContext(Dice_exprContext.class,0);
		}
		public TerminalNode R_PAR() { return getToken(GrogtalkParser.R_PAR, 0); }
		public Hit_points_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hit_points_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).enterHit_points_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).exitHit_points_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrogtalkVisitor ) return ((GrogtalkVisitor<? extends T>)visitor).visitHit_points_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Hit_points_exprContext hit_points_expr() throws RecognitionException {
		Hit_points_exprContext _localctx = new Hit_points_exprContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_hit_points_expr);
		try {
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(235);
				match(INT);
				setState(236);
				match(L_PAR);
				setState(237);
				dice_expr();
				setState(238);
				match(R_PAR);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				dice_expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Common_exprContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(GrogtalkParser.STRING, 0); }
		public Common_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_common_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).enterCommon_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).exitCommon_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrogtalkVisitor ) return ((GrogtalkVisitor<? extends T>)visitor).visitCommon_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Common_exprContext common_expr() throws RecognitionException {
		Common_exprContext _localctx = new Common_exprContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_common_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Action_objContext extends ParserRuleContext {
		public TerminalNode L_BRACKET() { return getToken(GrogtalkParser.L_BRACKET, 0); }
		public List<Action_exprContext> action_expr() {
			return getRuleContexts(Action_exprContext.class);
		}
		public Action_exprContext action_expr(int i) {
			return getRuleContext(Action_exprContext.class,i);
		}
		public TerminalNode R_BRACKET() { return getToken(GrogtalkParser.R_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GrogtalkParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrogtalkParser.COMMA, i);
		}
		public Action_objContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action_obj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).enterAction_obj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).exitAction_obj(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrogtalkVisitor ) return ((GrogtalkVisitor<? extends T>)visitor).visitAction_obj(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Action_objContext action_obj() throws RecognitionException {
		Action_objContext _localctx = new Action_objContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_action_obj);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(L_BRACKET);
			setState(246);
			action_expr();
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(247);
				match(COMMA);
				setState(248);
				action_expr();
				}
				}
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(254);
			match(R_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Action_exprContext extends ParserRuleContext {
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public TerminalNode COLON() { return getToken(GrogtalkParser.COLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Action_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).enterAction_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).exitAction_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrogtalkVisitor ) return ((GrogtalkVisitor<? extends T>)visitor).visitAction_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Action_exprContext action_expr() throws RecognitionException {
		Action_exprContext _localctx = new Action_exprContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_action_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			key();
			setState(257);
			match(COLON);
			setState(258);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeyContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(GrogtalkParser.STRING, 0); }
		public KeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).enterKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).exitKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrogtalkVisitor ) return ((GrogtalkVisitor<? extends T>)visitor).visitKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(GrogtalkParser.STRING, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrogtalkVisitor ) return ((GrogtalkVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Speed_exprContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(GrogtalkParser.STRING, 0); }
		public Speed_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_speed_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).enterSpeed_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).exitSpeed_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrogtalkVisitor ) return ((GrogtalkVisitor<? extends T>)visitor).visitSpeed_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Speed_exprContext speed_expr() throws RecognitionException {
		Speed_exprContext _localctx = new Speed_exprContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_speed_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifierContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GrogtalkParser.INT, 0); }
		public TerminalNode PLUS() { return getToken(GrogtalkParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(GrogtalkParser.MINUS, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).exitModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrogtalkVisitor ) return ((GrogtalkVisitor<? extends T>)visitor).visitModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(267);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return abilities_sempred((AbilitiesContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean abilities_sempred(AbilitiesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return  abilityCount == 5 ;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u0110\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\3\3\3\3\3\3\7\3T\n"+
		"\3\f\3\16\3W\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4o\n\4\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\6\r\u0099\n\r\r\r\16\r\u009a\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\7\33\u00d6\n\33\f\33\16\33\u00d9\13\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\5\35\u00e6\n\35"+
		"\3\36\3\36\3\36\3\36\5\36\u00ec\n\36\3\37\3\37\3\37\3\37\3\37\3\37\5\37"+
		"\u00f4\n\37\3 \3 \3!\3!\3!\3!\7!\u00fc\n!\f!\16!\u00ff\13!\3!\3!\3\"\3"+
		"\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\3&\2\2\'\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJ\2\4\3\2\3\4\3\2\r\16\2"+
		"\u0106\2L\3\2\2\2\4P\3\2\2\2\6n\3\2\2\2\bp\3\2\2\2\nt\3\2\2\2\fx\3\2\2"+
		"\2\16|\3\2\2\2\20\u0080\3\2\2\2\22\u0084\3\2\2\2\24\u0088\3\2\2\2\26\u008c"+
		"\3\2\2\2\30\u0090\3\2\2\2\32\u009f\3\2\2\2\34\u00a3\3\2\2\2\36\u00a6\3"+
		"\2\2\2 \u00a9\3\2\2\2\"\u00ad\3\2\2\2$\u00b1\3\2\2\2&\u00b5\3\2\2\2(\u00b9"+
		"\3\2\2\2*\u00bd\3\2\2\2,\u00c1\3\2\2\2.\u00c5\3\2\2\2\60\u00c9\3\2\2\2"+
		"\62\u00cd\3\2\2\2\64\u00d1\3\2\2\2\66\u00dc\3\2\2\28\u00e1\3\2\2\2:\u00e7"+
		"\3\2\2\2<\u00f3\3\2\2\2>\u00f5\3\2\2\2@\u00f7\3\2\2\2B\u0102\3\2\2\2D"+
		"\u0106\3\2\2\2F\u0108\3\2\2\2H\u010a\3\2\2\2J\u010c\3\2\2\2LM\7\5\2\2"+
		"MN\5\4\3\2NO\7\6\2\2O\3\3\2\2\2PU\5\6\4\2QR\7\13\2\2RT\5\6\4\2SQ\3\2\2"+
		"\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2V\5\3\2\2\2WU\3\2\2\2Xo\5\b\5\2Yo\5\n"+
		"\6\2Zo\5\f\7\2[o\5\16\b\2\\o\5\20\t\2]o\5\22\n\2^o\5\24\13\2_o\5\26\f"+
		"\2`o\5\30\r\2ao\5\32\16\2bo\5\34\17\2co\5\36\20\2do\5 \21\2eo\5\"\22\2"+
		"fo\5$\23\2go\5&\24\2ho\5(\25\2io\5*\26\2jo\5,\27\2ko\5.\30\2lo\5\60\31"+
		"\2mo\5\62\32\2nX\3\2\2\2nY\3\2\2\2nZ\3\2\2\2n[\3\2\2\2n\\\3\2\2\2n]\3"+
		"\2\2\2n^\3\2\2\2n_\3\2\2\2n`\3\2\2\2na\3\2\2\2nb\3\2\2\2nc\3\2\2\2nd\3"+
		"\2\2\2ne\3\2\2\2nf\3\2\2\2ng\3\2\2\2nh\3\2\2\2ni\3\2\2\2nj\3\2\2\2nk\3"+
		"\2\2\2nl\3\2\2\2nm\3\2\2\2o\7\3\2\2\2pq\7\20\2\2qr\7\f\2\2rs\5> \2s\t"+
		"\3\2\2\2tu\7\21\2\2uv\7\f\2\2vw\5> \2w\13\3\2\2\2xy\7\22\2\2yz\7\f\2\2"+
		"z{\5> \2{\r\3\2\2\2|}\7\23\2\2}~\7\f\2\2~\177\5\64\33\2\177\17\3\2\2\2"+
		"\u0080\u0081\7\24\2\2\u0081\u0082\7\f\2\2\u0082\u0083\5> \2\u0083\21\3"+
		"\2\2\2\u0084\u0085\7\25\2\2\u0085\u0086\7\f\2\2\u0086\u0087\5> \2\u0087"+
		"\23\3\2\2\2\u0088\u0089\7\26\2\2\u0089\u008a\7\f\2\2\u008a\u008b\5<\37"+
		"\2\u008b\25\3\2\2\2\u008c\u008d\7\27\2\2\u008d\u008e\7\f\2\2\u008e\u008f"+
		"\5> \2\u008f\27\3\2\2\2\u0090\u0091\7\31\2\2\u0091\u0092\7\f\2\2\u0092"+
		"\u0093\7\7\2\2\u0093\u0098\5\66\34\2\u0094\u0095\7\13\2\2\u0095\u0096"+
		"\5\66\34\2\u0096\u0097\b\r\1\2\u0097\u0099\3\2\2\2\u0098\u0094\3\2\2\2"+
		"\u0099\u009a\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c"+
		"\3\2\2\2\u009c\u009d\7\b\2\2\u009d\u009e\6\r\2\2\u009e\31\3\2\2\2\u009f"+
		"\u00a0\7\30\2\2\u00a0\u00a1\7\f\2\2\u00a1\u00a2\5> \2\u00a2\33\3\2\2\2"+
		"\u00a3\u00a4\7\32\2\2\u00a4\u00a5\5> \2\u00a5\35\3\2\2\2\u00a6\u00a7\7"+
		"\33\2\2\u00a7\u00a8\5> \2\u00a8\37\3\2\2\2\u00a9\u00aa\7\34\2\2\u00aa"+
		"\u00ab\7\f\2\2\u00ab\u00ac\5> \2\u00ac!\3\2\2\2\u00ad\u00ae\7\35\2\2\u00ae"+
		"\u00af\7\f\2\2\u00af\u00b0\5> \2\u00b0#\3\2\2\2\u00b1\u00b2\7\36\2\2\u00b2"+
		"\u00b3\7\f\2\2\u00b3\u00b4\5> \2\u00b4%\3\2\2\2\u00b5\u00b6\7\37\2\2\u00b6"+
		"\u00b7\7\f\2\2\u00b7\u00b8\5> \2\u00b8\'\3\2\2\2\u00b9\u00ba\7 \2\2\u00ba"+
		"\u00bb\7\f\2\2\u00bb\u00bc\5> \2\u00bc)\3\2\2\2\u00bd\u00be\7!\2\2\u00be"+
		"\u00bf\7\f\2\2\u00bf\u00c0\5> \2\u00c0+\3\2\2\2\u00c1\u00c2\7\"\2\2\u00c2"+
		"\u00c3\7\f\2\2\u00c3\u00c4\5> \2\u00c4-\3\2\2\2\u00c5\u00c6\7#\2\2\u00c6"+
		"\u00c7\7\f\2\2\u00c7\u00c8\5@!\2\u00c8/\3\2\2\2\u00c9\u00ca\7$\2\2\u00ca"+
		"\u00cb\7\f\2\2\u00cb\u00cc\5@!\2\u00cc\61\3\2\2\2\u00cd\u00ce\7%\2\2\u00ce"+
		"\u00cf\7\f\2\2\u00cf\u00d0\5@!\2\u00d0\63\3\2\2\2\u00d1\u00d2\7\7\2\2"+
		"\u00d2\u00d7\7\17\2\2\u00d3\u00d4\7\13\2\2\u00d4\u00d6\7\17\2\2\u00d5"+
		"\u00d3\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2"+
		"\2\2\u00d8\u00da\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00db\7\b\2\2\u00db"+
		"\65\3\2\2\2\u00dc\u00dd\7\'\2\2\u00dd\u00de\7\t\2\2\u00de\u00df\5J&\2"+
		"\u00df\u00e0\7\n\2\2\u00e0\67\3\2\2\2\u00e1\u00e2\7\'\2\2\u00e2\u00e3"+
		"\t\2\2\2\u00e3\u00e5\7\'\2\2\u00e4\u00e6\5J&\2\u00e5\u00e4\3\2\2\2\u00e5"+
		"\u00e6\3\2\2\2\u00e69\3\2\2\2\u00e7\u00eb\7\'\2\2\u00e8\u00e9\7\t\2\2"+
		"\u00e9\u00ea\7\17\2\2\u00ea\u00ec\7\n\2\2\u00eb\u00e8\3\2\2\2\u00eb\u00ec"+
		"\3\2\2\2\u00ec;\3\2\2\2\u00ed\u00ee\7\'\2\2\u00ee\u00ef\7\t\2\2\u00ef"+
		"\u00f0\58\35\2\u00f0\u00f1\7\n\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f4\58"+
		"\35\2\u00f3\u00ed\3\2\2\2\u00f3\u00f2\3\2\2\2\u00f4=\3\2\2\2\u00f5\u00f6"+
		"\7\17\2\2\u00f6?\3\2\2\2\u00f7\u00f8\7\5\2\2\u00f8\u00fd\5B\"\2\u00f9"+
		"\u00fa\7\13\2\2\u00fa\u00fc\5B\"\2\u00fb\u00f9\3\2\2\2\u00fc\u00ff\3\2"+
		"\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff"+
		"\u00fd\3\2\2\2\u0100\u0101\7\6\2\2\u0101A\3\2\2\2\u0102\u0103\5D#\2\u0103"+
		"\u0104\7\f\2\2\u0104\u0105\5F$\2\u0105C\3\2\2\2\u0106\u0107\7\17\2\2\u0107"+
		"E\3\2\2\2\u0108\u0109\7\17\2\2\u0109G\3\2\2\2\u010a\u010b\7\17\2\2\u010b"+
		"I\3\2\2\2\u010c\u010d\t\3\2\2\u010d\u010e\7\'\2\2\u010eK\3\2\2\2\nUn\u009a"+
		"\u00d7\u00e5\u00eb\u00f3\u00fd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}