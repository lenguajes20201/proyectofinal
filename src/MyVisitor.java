import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class MyVisitor<T> extends GrogtalkBaseVisitor <T>{

    //Tabla de simbolos
    HashMap<String, Object> table = new HashMap<>();

    Creature Criatura = new Creature();

    @Override public T visitCreature(GrogtalkParser.CreatureContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitCreature_body(GrogtalkParser.Creature_bodyContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitStatistic(GrogtalkParser.StatisticContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitName(GrogtalkParser.NameContext ctx) {
        String name = ctx.common_expr().getText();
        Criatura.setName(name.substring(1,name.length()-1));
        //System.out.println(name.substring(1,name.length()-1));
        return null;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitSize(GrogtalkParser.SizeContext ctx) {
        String size = ctx.common_expr().getText();
        Criatura.setSize(size.substring(1,size.length()-1));
        //System.out.println(size.substring(1,size.length()-1));
        return null;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitType(GrogtalkParser.TypeContext ctx) {
        String Type = ctx.common_expr().getText();
        Criatura.setType(Type.substring(1,Type.length()-1));
        //System.out.println(Type.substring(1,Type.length()-1));
        return null;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitTags(GrogtalkParser.TagsContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitAlignment(GrogtalkParser.AlignmentContext ctx) {
        String Alignment = ctx.common_expr().getText();
        Criatura.setAlignment(Alignment.substring(1,Alignment.length()-1));
        //System.out.println(Alignment.substring(1,Alignment.length()-1));
        return null;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitArmor_class(GrogtalkParser.Armor_classContext ctx) {
        String Armor_class = ctx.common_expr().getText();
        Criatura.setArmorClass(Armor_class.substring(1,Armor_class.length()-1));
        //System.out.println(Armor_class.substring(1,Armor_class.length()-1));
        return null;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitHitpoints(GrogtalkParser.HitpointsContext ctx) {

        String hitPointExpr = (String) visitHit_points_expr(ctx.hit_points_expr());
        Criatura.setHitPoints(hitPointExpr);

        return null;

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitSpeed(GrogtalkParser.SpeedContext ctx) {
        String Speed = ctx.common_expr().getText();
        Criatura.setSpeed(Speed.substring(1,Speed.length()-1));
        //System.out.println(Speed.substring(1,Speed.length()-1));
        return null;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitAbilities(GrogtalkParser.AbilitiesContext ctx) {

        List<GrogtalkParser.Ability_exprContext> abilitylist  = ctx.ability_expr();
        List <String> abilityString = new ArrayList<>();

        for (GrogtalkParser.Ability_exprContext ability: abilitylist) {
            abilityString.add(ability.getText());
            //System.out.println(ability.getText());

        }

        Criatura.setAbilityScores(abilityString);

        return null;

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitSenses(GrogtalkParser.SensesContext ctx) {
        String Senses = ctx.common_expr().getText();
        Criatura.setSenses(Senses.substring(1,Senses.length()-1));
        //System.out.println(Senses.substring(1,Senses.length()-1));
        return null;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitSaving_throws(GrogtalkParser.Saving_throwsContext ctx) {
        String Saving_throws = ctx.common_expr().getText();
        Criatura.setSavingThrows(Saving_throws.substring(1,Saving_throws.length()-1));
        //System.out.println(Saving_throws.substring(1,Saving_throws.length()-1));
        return null;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitSkills(GrogtalkParser.SkillsContext ctx) {
        String Skills = ctx.common_expr().getText();
        Criatura.setSkills(Skills.substring(1,Skills.length()-1));
        //System.out.println(Skills.substring(1,Skills.length()-1));
        return null;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitDamage_immunities(GrogtalkParser.Damage_immunitiesContext ctx) {
        String Damage_immunities = ctx.common_expr().getText();
        Criatura.setDam_immunities(Damage_immunities.substring(1,Damage_immunities.length()-1));
        //System.out.println(Damage_immunities.substring(1,Damage_immunities.length()-1));
        return null;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitDamage_resistances(GrogtalkParser.Damage_resistancesContext ctx) {
        String Damage_resistances = ctx.common_expr().getText();
        Criatura.setDam_resistances(Damage_resistances.substring(1,Damage_resistances.length()-1));
        //System.out.println(Damage_resistances.substring(1,Damage_resistances.length()-1));
        return null;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitDamage_vulnerabilities(GrogtalkParser.Damage_vulnerabilitiesContext ctx) {
        String Damage_vulnerabilities = ctx.common_expr().getText();
        Criatura.setDam_vulnerabilities(Damage_vulnerabilities.substring(1,Damage_vulnerabilities.length()-1));
        //System.out.println(Damage_vulnerabilities.substring(1,Damage_vulnerabilities.length()-1));
        return null;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitCondition_immunities(GrogtalkParser.Condition_immunitiesContext ctx) {
        String Condition_immunities = ctx.common_expr().getText();
        Criatura.setCond_Immunities(Condition_immunities.substring(1,Condition_immunities.length()-1));
        //System.out.println(Condition_immunities.substring(1,Condition_immunities.length()-1));
        return null;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitLanguages(GrogtalkParser.LanguagesContext ctx) {
        String Languages = ctx.common_expr().getText();
        Criatura.setLanguages(Languages.substring(1,Languages.length()-1));
        //System.out.println(Languages.substring(1,Languages.length()-1));
        return null;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitChallenge(GrogtalkParser.ChallengeContext ctx) {
        String Challenge = ctx.common_expr().getText();
        Criatura.setChallenge(Challenge.substring(1,Challenge.length()-1));
        //System.out.println(Challenge.substring(1,Challenge.length()-1));
        return null;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitSpecial_traits(GrogtalkParser.Special_traitsContext ctx) {
        String Special_traits = ctx.common_expr().getText();
        Criatura.setSpecial_Traits(Special_traits.substring(1,Special_traits.length()-1));
        //System.out.println(Special_traits.substring(1,Special_traits.length()-1));
        return null;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitActions(GrogtalkParser.ActionsContext ctx) {
        HashMap <String, String> actions = (HashMap <String, String>) visitAction_obj(ctx.action_obj());

        Criatura.setActions(actions);
        //System.out.println("tagas "+Criatura.toString());
        return null;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitReactions(GrogtalkParser.ReactionsContext ctx) {
        HashMap <String, String> actions = (HashMap <String, String>) visitAction_obj(ctx.action_obj());

        Criatura.setReactions(actions);

        return null;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitLegendary_actions(GrogtalkParser.Legendary_actionsContext ctx) {
        HashMap <String, String> actions = (HashMap <String, String>) visitAction_obj(ctx.action_obj());

        Criatura.setLegendaryActions(actions);

        return null;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitTaglist(GrogtalkParser.TaglistContext ctx) {
        List<TerminalNode> Taglist  = ctx.STRING();
        List <String> tagString = new ArrayList<>();

        for (TerminalNode tag: Taglist) {

            tagString.add(tag.getText().substring(1,tag.getText().length()-1));

        }
        Criatura.setTags(tagString);

        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitAbility_expr(GrogtalkParser.Ability_exprContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitDice_expr(GrogtalkParser.Dice_exprContext ctx) {
        int promedio = 0;
        if (ctx.modifier()!= null){
            promedio = Integer.valueOf(ctx.INT(0).getText())+ Integer.valueOf(ctx.INT(0).getText())*Integer.valueOf(ctx.INT(1).getText());
            T val_modifier = visitModifier(ctx.modifier());
            promedio = promedio + ((Integer)val_modifier)*2 ;
            promedio = promedio/2;

        }else {
            promedio = Integer.valueOf(ctx.INT(0).getText())+ Integer.valueOf(ctx.INT(0).getText())*Integer.valueOf(ctx.INT(1).getText());
            promedio = promedio/2;
        }


        return (T) new Integer(promedio) ;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitArmor_class_expr(GrogtalkParser.Armor_class_exprContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitHit_points_expr(GrogtalkParser.Hit_points_exprContext ctx) {
        String hitPointexpr = "";
        if(ctx.INT() == null){
            Integer promedio = (Integer) visitDice_expr(ctx.dice_expr());
            hitPointexpr = promedio + "(" + ctx.dice_expr().getText() + ")";

        }else {
            hitPointexpr = ctx.getText();
        }

        //System.out.println("hitpoint "+hitPointexpr);

        return (T) hitPointexpr;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitCommon_expr(GrogtalkParser.Common_exprContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitAction_obj(GrogtalkParser.Action_objContext ctx) {
        HashMap<String, String> actions = new HashMap<>();
        List<GrogtalkParser.Action_exprContext> actionList = ctx.action_expr();


        for (GrogtalkParser.Action_exprContext action: actionList) {
            String key = action.key().getText();
            String value = action.value().getText();
            actions.put(key.substring(1,key.length()-1),value.substring(1,value.length()-1));
        }

        return (T) actions;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitAction_expr(GrogtalkParser.Action_exprContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitKey(GrogtalkParser.KeyContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitValue(GrogtalkParser.ValueContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitSpeed_expr(GrogtalkParser.Speed_exprContext ctx) { return visitChildren(ctx); }

    @Override public T visitModifier(GrogtalkParser.ModifierContext ctx) {
        if (ctx.MINUS() == null){
            return (T) Integer.valueOf(ctx.INT().getText());
        }else {

            Integer  value =  Integer.valueOf(ctx.INT().getText())*(-1);
            return (T) value;
        }
    }
}
