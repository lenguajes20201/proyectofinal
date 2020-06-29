// Generated from D:/Users/ACER/Documents/2020-1_SEMESTRE_9/Lenguajes de programacion/proyectofinal/grammar\Grogtalk.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrogtalkParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrogtalkVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrogtalkParser#creature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreature(GrogtalkParser.CreatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrogtalkParser#creature_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreature_body(GrogtalkParser.Creature_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrogtalkParser#statistic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatistic(GrogtalkParser.StatisticContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrogtalkParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(GrogtalkParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrogtalkParser#size}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSize(GrogtalkParser.SizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrogtalkParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(GrogtalkParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrogtalkParser#tags}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTags(GrogtalkParser.TagsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrogtalkParser#alignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlignment(GrogtalkParser.AlignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrogtalkParser#armor_class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArmor_class(GrogtalkParser.Armor_classContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrogtalkParser#hitpoints}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHitpoints(GrogtalkParser.HitpointsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrogtalkParser#speed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpeed(GrogtalkParser.SpeedContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrogtalkParser#abilities}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbilities(GrogtalkParser.AbilitiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrogtalkParser#senses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSenses(GrogtalkParser.SensesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrogtalkParser#saving_throws}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSaving_throws(GrogtalkParser.Saving_throwsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrogtalkParser#skills}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkills(GrogtalkParser.SkillsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrogtalkParser#damage_immunities}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDamage_immunities(GrogtalkParser.Damage_immunitiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrogtalkParser#damage_resistances}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDamage_resistances(GrogtalkParser.Damage_resistancesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrogtalkParser#damage_vulnerabilities}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDamage_vulnerabilities(GrogtalkParser.Damage_vulnerabilitiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrogtalkParser#condition_immunities}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_immunities(GrogtalkParser.Condition_immunitiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrogtalkParser#languages}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLanguages(GrogtalkParser.LanguagesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrogtalkParser#challenge}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChallenge(GrogtalkParser.ChallengeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrogtalkParser#special_traits}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecial_traits(GrogtalkParser.Special_traitsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrogtalkParser#actions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActions(GrogtalkParser.ActionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrogtalkParser#reactions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReactions(GrogtalkParser.ReactionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrogtalkParser#legendary_actions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLegendary_actions(GrogtalkParser.Legendary_actionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrogtalkParser#taglist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTaglist(GrogtalkParser.TaglistContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrogtalkParser#ability_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbility_expr(GrogtalkParser.Ability_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrogtalkParser#dice_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDice_expr(GrogtalkParser.Dice_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrogtalkParser#armor_class_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArmor_class_expr(GrogtalkParser.Armor_class_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrogtalkParser#hit_points_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHit_points_expr(GrogtalkParser.Hit_points_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrogtalkParser#common_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommon_expr(GrogtalkParser.Common_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrogtalkParser#action_obj}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction_obj(GrogtalkParser.Action_objContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrogtalkParser#action_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction_expr(GrogtalkParser.Action_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrogtalkParser#key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey(GrogtalkParser.KeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrogtalkParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(GrogtalkParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrogtalkParser#speed_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpeed_expr(GrogtalkParser.Speed_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrogtalkParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(GrogtalkParser.ModifierContext ctx);
}