// Generated from D:/Users/ACER/Documents/2020-1_SEMESTRE_9/Lenguajes de programacion/proyectofinal/grammar\Grogtalk.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrogtalkParser}.
 */
public interface GrogtalkListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrogtalkParser#creature}.
	 * @param ctx the parse tree
	 */
	void enterCreature(GrogtalkParser.CreatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrogtalkParser#creature}.
	 * @param ctx the parse tree
	 */
	void exitCreature(GrogtalkParser.CreatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrogtalkParser#creature_body}.
	 * @param ctx the parse tree
	 */
	void enterCreature_body(GrogtalkParser.Creature_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrogtalkParser#creature_body}.
	 * @param ctx the parse tree
	 */
	void exitCreature_body(GrogtalkParser.Creature_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrogtalkParser#statistic}.
	 * @param ctx the parse tree
	 */
	void enterStatistic(GrogtalkParser.StatisticContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrogtalkParser#statistic}.
	 * @param ctx the parse tree
	 */
	void exitStatistic(GrogtalkParser.StatisticContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrogtalkParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(GrogtalkParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrogtalkParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(GrogtalkParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrogtalkParser#size}.
	 * @param ctx the parse tree
	 */
	void enterSize(GrogtalkParser.SizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrogtalkParser#size}.
	 * @param ctx the parse tree
	 */
	void exitSize(GrogtalkParser.SizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrogtalkParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(GrogtalkParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrogtalkParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(GrogtalkParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrogtalkParser#tags}.
	 * @param ctx the parse tree
	 */
	void enterTags(GrogtalkParser.TagsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrogtalkParser#tags}.
	 * @param ctx the parse tree
	 */
	void exitTags(GrogtalkParser.TagsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrogtalkParser#alignment}.
	 * @param ctx the parse tree
	 */
	void enterAlignment(GrogtalkParser.AlignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrogtalkParser#alignment}.
	 * @param ctx the parse tree
	 */
	void exitAlignment(GrogtalkParser.AlignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrogtalkParser#armor_class}.
	 * @param ctx the parse tree
	 */
	void enterArmor_class(GrogtalkParser.Armor_classContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrogtalkParser#armor_class}.
	 * @param ctx the parse tree
	 */
	void exitArmor_class(GrogtalkParser.Armor_classContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrogtalkParser#hitpoints}.
	 * @param ctx the parse tree
	 */
	void enterHitpoints(GrogtalkParser.HitpointsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrogtalkParser#hitpoints}.
	 * @param ctx the parse tree
	 */
	void exitHitpoints(GrogtalkParser.HitpointsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrogtalkParser#speed}.
	 * @param ctx the parse tree
	 */
	void enterSpeed(GrogtalkParser.SpeedContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrogtalkParser#speed}.
	 * @param ctx the parse tree
	 */
	void exitSpeed(GrogtalkParser.SpeedContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrogtalkParser#abilities}.
	 * @param ctx the parse tree
	 */
	void enterAbilities(GrogtalkParser.AbilitiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrogtalkParser#abilities}.
	 * @param ctx the parse tree
	 */
	void exitAbilities(GrogtalkParser.AbilitiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrogtalkParser#senses}.
	 * @param ctx the parse tree
	 */
	void enterSenses(GrogtalkParser.SensesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrogtalkParser#senses}.
	 * @param ctx the parse tree
	 */
	void exitSenses(GrogtalkParser.SensesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrogtalkParser#saving_throws}.
	 * @param ctx the parse tree
	 */
	void enterSaving_throws(GrogtalkParser.Saving_throwsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrogtalkParser#saving_throws}.
	 * @param ctx the parse tree
	 */
	void exitSaving_throws(GrogtalkParser.Saving_throwsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrogtalkParser#skills}.
	 * @param ctx the parse tree
	 */
	void enterSkills(GrogtalkParser.SkillsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrogtalkParser#skills}.
	 * @param ctx the parse tree
	 */
	void exitSkills(GrogtalkParser.SkillsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrogtalkParser#damage_immunities}.
	 * @param ctx the parse tree
	 */
	void enterDamage_immunities(GrogtalkParser.Damage_immunitiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrogtalkParser#damage_immunities}.
	 * @param ctx the parse tree
	 */
	void exitDamage_immunities(GrogtalkParser.Damage_immunitiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrogtalkParser#damage_resistances}.
	 * @param ctx the parse tree
	 */
	void enterDamage_resistances(GrogtalkParser.Damage_resistancesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrogtalkParser#damage_resistances}.
	 * @param ctx the parse tree
	 */
	void exitDamage_resistances(GrogtalkParser.Damage_resistancesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrogtalkParser#damage_vulnerabilities}.
	 * @param ctx the parse tree
	 */
	void enterDamage_vulnerabilities(GrogtalkParser.Damage_vulnerabilitiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrogtalkParser#damage_vulnerabilities}.
	 * @param ctx the parse tree
	 */
	void exitDamage_vulnerabilities(GrogtalkParser.Damage_vulnerabilitiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrogtalkParser#condition_immunities}.
	 * @param ctx the parse tree
	 */
	void enterCondition_immunities(GrogtalkParser.Condition_immunitiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrogtalkParser#condition_immunities}.
	 * @param ctx the parse tree
	 */
	void exitCondition_immunities(GrogtalkParser.Condition_immunitiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrogtalkParser#languages}.
	 * @param ctx the parse tree
	 */
	void enterLanguages(GrogtalkParser.LanguagesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrogtalkParser#languages}.
	 * @param ctx the parse tree
	 */
	void exitLanguages(GrogtalkParser.LanguagesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrogtalkParser#challenge}.
	 * @param ctx the parse tree
	 */
	void enterChallenge(GrogtalkParser.ChallengeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrogtalkParser#challenge}.
	 * @param ctx the parse tree
	 */
	void exitChallenge(GrogtalkParser.ChallengeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrogtalkParser#special_traits}.
	 * @param ctx the parse tree
	 */
	void enterSpecial_traits(GrogtalkParser.Special_traitsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrogtalkParser#special_traits}.
	 * @param ctx the parse tree
	 */
	void exitSpecial_traits(GrogtalkParser.Special_traitsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrogtalkParser#actions}.
	 * @param ctx the parse tree
	 */
	void enterActions(GrogtalkParser.ActionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrogtalkParser#actions}.
	 * @param ctx the parse tree
	 */
	void exitActions(GrogtalkParser.ActionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrogtalkParser#reactions}.
	 * @param ctx the parse tree
	 */
	void enterReactions(GrogtalkParser.ReactionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrogtalkParser#reactions}.
	 * @param ctx the parse tree
	 */
	void exitReactions(GrogtalkParser.ReactionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrogtalkParser#legendary_actions}.
	 * @param ctx the parse tree
	 */
	void enterLegendary_actions(GrogtalkParser.Legendary_actionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrogtalkParser#legendary_actions}.
	 * @param ctx the parse tree
	 */
	void exitLegendary_actions(GrogtalkParser.Legendary_actionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrogtalkParser#taglist}.
	 * @param ctx the parse tree
	 */
	void enterTaglist(GrogtalkParser.TaglistContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrogtalkParser#taglist}.
	 * @param ctx the parse tree
	 */
	void exitTaglist(GrogtalkParser.TaglistContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrogtalkParser#ability_expr}.
	 * @param ctx the parse tree
	 */
	void enterAbility_expr(GrogtalkParser.Ability_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrogtalkParser#ability_expr}.
	 * @param ctx the parse tree
	 */
	void exitAbility_expr(GrogtalkParser.Ability_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrogtalkParser#dice_expr}.
	 * @param ctx the parse tree
	 */
	void enterDice_expr(GrogtalkParser.Dice_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrogtalkParser#dice_expr}.
	 * @param ctx the parse tree
	 */
	void exitDice_expr(GrogtalkParser.Dice_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrogtalkParser#armor_class_expr}.
	 * @param ctx the parse tree
	 */
	void enterArmor_class_expr(GrogtalkParser.Armor_class_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrogtalkParser#armor_class_expr}.
	 * @param ctx the parse tree
	 */
	void exitArmor_class_expr(GrogtalkParser.Armor_class_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrogtalkParser#hit_points_expr}.
	 * @param ctx the parse tree
	 */
	void enterHit_points_expr(GrogtalkParser.Hit_points_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrogtalkParser#hit_points_expr}.
	 * @param ctx the parse tree
	 */
	void exitHit_points_expr(GrogtalkParser.Hit_points_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrogtalkParser#common_expr}.
	 * @param ctx the parse tree
	 */
	void enterCommon_expr(GrogtalkParser.Common_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrogtalkParser#common_expr}.
	 * @param ctx the parse tree
	 */
	void exitCommon_expr(GrogtalkParser.Common_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrogtalkParser#action_obj}.
	 * @param ctx the parse tree
	 */
	void enterAction_obj(GrogtalkParser.Action_objContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrogtalkParser#action_obj}.
	 * @param ctx the parse tree
	 */
	void exitAction_obj(GrogtalkParser.Action_objContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrogtalkParser#action_expr}.
	 * @param ctx the parse tree
	 */
	void enterAction_expr(GrogtalkParser.Action_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrogtalkParser#action_expr}.
	 * @param ctx the parse tree
	 */
	void exitAction_expr(GrogtalkParser.Action_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrogtalkParser#key}.
	 * @param ctx the parse tree
	 */
	void enterKey(GrogtalkParser.KeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrogtalkParser#key}.
	 * @param ctx the parse tree
	 */
	void exitKey(GrogtalkParser.KeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrogtalkParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(GrogtalkParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrogtalkParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(GrogtalkParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrogtalkParser#speed_expr}.
	 * @param ctx the parse tree
	 */
	void enterSpeed_expr(GrogtalkParser.Speed_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrogtalkParser#speed_expr}.
	 * @param ctx the parse tree
	 */
	void exitSpeed_expr(GrogtalkParser.Speed_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrogtalkParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(GrogtalkParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrogtalkParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(GrogtalkParser.ModifierContext ctx);
}