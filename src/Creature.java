import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Creature {
    String Name, Size, Type, Alignment, ArmorClass, HitPoints, Speed,SavingThrows, Skills, dam_resistances,
            dam_vulnerabilities, dam_immunities, cond_Immunities,Senses,Languages,Challenge,Special_Traits;
    List <String> tags;
    List <String> AbilityScores;
    HashMap <String,String> Actions, Reactions, LegendaryActions;



    public Creature(){}

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getAlignment() {
        return Alignment;
    }

    public void setAlignment(String alignment) {
        Alignment = alignment;
    }

    public String getArmorClass() {
        return ArmorClass;
    }

    public void setArmorClass(String armorClass) {
        ArmorClass = armorClass;
    }

    public String getHitPoints() {
        return HitPoints;
    }

    public void setHitPoints(String hitPoints) {
        HitPoints = hitPoints;
    }

    public String getSpeed() {
        return Speed;
    }

    public void setSpeed(String speed) {
        Speed = speed;
    }

    public List<String> getAbilityScores() {
        return AbilityScores;
    }

    public void setAbilityScores(List<String> abilityScores) {
        AbilityScores = abilityScores;
    }

    public String getSavingThrows() {
        return SavingThrows;
    }

    public void setSavingThrows(String savingThrows) {
        SavingThrows = savingThrows;
    }

    public String getSkills() {
        return Skills;
    }

    public void setSkills(String skills) {
        Skills = skills;
    }

    public String getDam_resistances() {
        return dam_resistances;
    }

    public void setDam_resistances(String dam_resistances) {
        this.dam_resistances = dam_resistances;
    }

    public String getDam_vulnerabilities() {
        return dam_vulnerabilities;
    }

    public void setDam_vulnerabilities(String dam_vulnerabilities) {
        this.dam_vulnerabilities = dam_vulnerabilities;
    }

    public String getDam_immunities() {
        return dam_immunities;
    }

    public void setDam_immunities(String dam_immunities) {
        this.dam_immunities = dam_immunities;
    }

    public String getCond_Immunities() {
        return cond_Immunities;
    }

    public void setCond_Immunities(String cond_Immunities) {
        this.cond_Immunities = cond_Immunities;
    }

    public String getSenses() {
        return Senses;
    }

    public void setSenses(String senses) {
        Senses = senses;
    }

    public String getLanguages() {
        return Languages;
    }

    public void setLanguages(String languages) {
        Languages = languages;
    }

    public String getChallenge() {
        return Challenge;
    }

    public void setChallenge(String challenge) {
        Challenge = challenge;
    }

    public String getSpecial_Traits() {
        return Special_Traits;
    }

    public void setSpecial_Traits(String special_Traits) {
        Special_Traits = special_Traits;
    }

    public HashMap<String, String> getActions() {
        return Actions;
    }

    public void setActions(HashMap<String, String> actions) {
        Actions = actions;
    }

    public HashMap<String, String> getReactions() {
        return Reactions;
    }

    public void setReactions(HashMap<String, String> reactions) {
        Reactions = reactions;
    }

    public HashMap<String, String> getLegendaryActions() {
        return LegendaryActions;
    }

    public void setLegendaryActions(HashMap<String, String> legendaryActions) {
        LegendaryActions = legendaryActions;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }


    public String getTagsString (){
        String tagsOut;
        if(tags == null){
            tagsOut = "";
            return tagsOut;
        }

        tagsOut = "(";
        for (String tag : tags) {
            tagsOut = tagsOut.concat(tag+", ");
        }
        tagsOut = tagsOut.substring(0,tagsOut.length()-1);
        tagsOut = tagsOut.concat(")");
        return tagsOut;
    }
    public String getAbilitiesString (){
        String abilities = "|";

        for (String ability : AbilityScores) {
            abilities = abilities.concat(ability+"|");
        }
        return abilities;
    }

    public String getActionsString (){
        String actionsT = "";

        for (HashMap.Entry<String,String> action: Actions.entrySet()) {
            actionsT = actionsT.concat(String.format("> ***%s***. %s\n",action.getKey(),action.getValue()));
            actionsT = actionsT.concat(">\n");
        }
        actionsT = actionsT.concat(">");
        return actionsT;
    }

    public String getReactionsString (){
        String actionsT = "";

        for (HashMap.Entry<String,String> action: Reactions.entrySet()) {
            actionsT = actionsT.concat(String.format("> ***%s***. %s\n",action.getKey(),action.getValue()));
            actionsT = actionsT.concat(">\n");
        }
        actionsT = actionsT.concat(">");
        return actionsT;
    }

    public String getLegendaryActionsString (){
        String actionsT = "";

        for (HashMap.Entry<String,String> action: LegendaryActions.entrySet()) {
            actionsT = actionsT.concat(String.format("> ***%s***. %s\n",action.getKey(),action.getValue()));
            actionsT = actionsT.concat(">\n");
        }
        actionsT = actionsT.concat(">");
        return actionsT;
    }


    @Override
    public String toString() {
        return "Creature{" +
                "Name='" + Name + '\'' +
                ", Size='" + Size + '\'' +
                ", Type='" + Type + '\'' +
                ", Alignment='" + Alignment + '\'' +
                ", ArmorClass='" + ArmorClass + '\'' +
                ", HitPoints='" + HitPoints + '\'' +
                ", Speed='" + Speed + '\'' +
                ", AbilityScores='" + AbilityScores + '\'' +
                ", SavingThrows='" + SavingThrows + '\'' +
                ", Skills='" + Skills + '\'' +
                ", dam_resistances='" + dam_resistances + '\'' +
                ", dam_vulnerabilities='" + dam_vulnerabilities + '\'' +
                ", dam_immunities='" + dam_immunities + '\'' +
                ", cond_Immunities='" + cond_Immunities + '\'' +
                ", Senses='" + Senses + '\'' +
                ", Languages='" + Languages + '\'' +
                ", Challenge='" + Challenge + '\'' +
                ", Special_Traits='" + Special_Traits + '\'' +
                ", Actions='" + Actions + '\'' +
                ", Reactions='" + Reactions + '\'' +
                ", LegendaryActions='" + LegendaryActions + '\'' +
                ", tags=" + tags +
                '}';
    }
}
