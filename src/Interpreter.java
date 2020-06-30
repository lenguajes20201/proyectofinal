import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Interpreter {



	public static void toMarkdown ( Creature criatura){
		Creature c = criatura;
		String result = "___\n";
		//result = result +"> ## "+c.getName()+"\n";
		result = result.concat("> ## "+c.getName()+"\n");
		result = result.concat(String.format(">*%s %s %s, %s*\n",c.getSize(), c.getType(), c.getTagsString(), c.getAlignment()));
		result = result.concat("> ___\n");
		result = result.concat(String.format("> - **Armor Class** %s\n", c.getArmorClass()));
		result = result.concat(String.format("> - **Hit Points** %s\n", c.getHitPoints()));
		result = result.concat(String.format("> - **Speed** %s\n", c.getSpeed()));
		result = result.concat("> ___\n");
		result = result.concat(">|STR|DEX|CON|INT|WIS|CHA|\n");
		result = result.concat(">|:---:|:---:|:---:|:---:|:---:|:---:|\n");
		result = result.concat(String.format(">%s\n", c.getAbilitiesString()));
		result = result.concat("> ___\n");
		result = result.concat((c.getSavingThrows() != null)?String.format("> - **Saving Throws** %s\n",c.getSavingThrows()):"");
		result = result.concat((c.getSkills() != null)?String.format("> - **Skills** %s\n",c.getSkills()):"");
		result = result.concat((c.getDam_resistances() != null)?String.format("> - **Damage Resistances** %s\n",c.getDam_resistances()):"");
		result = result.concat((c.getDam_vulnerabilities() != null)?String.format("> - **Damage vulnerabilites** %s\n",c.getDam_vulnerabilities()):"");
		result = result.concat((c.getDam_immunities() != null)?String.format("> - **Damage Inmmunities** %s\n",c.getDam_immunities()):"");
		result = result.concat((c.getCond_Immunities() != null)?String.format("> - **Condition Immunities** %s\n",c.getCond_Immunities()):"");
		result = result.concat((c.getSenses() != null)?String.format("> - **Senses** %s\n",c.getSenses()):"");
		result = result.concat((c.getLanguages() != null)?String.format("> - **Languages** %s\n",c.getLanguages()):"");
		result = result.concat((c.getChallenge() != null)?String.format("> - **Challenge** %s\n",c.getChallenge()):"");
		result = result.concat("> ___\n");

		result = result.concat("> ### Actions\n");
		result = result.concat((c.getActions() != null)?String.format("%s\n", c.getActionsString()):"");

		result = result.concat((c.getReactions() != null)?"> ### Reactions\n":"");
		result = result.concat((c.getReactions() != null)?String.format("%s\n", c.getReactionsString()):"");

		result = result.concat((c.getLegendaryActions() != null)?"> ### Legendary Actions\n":"");
		result = result.concat((c.getLegendaryActions() != null)?String.format("%s\n", c.getLegendaryActionsString()):"");

		System.out.println(result);
	}

	public static void main(String [] args) throws Exception{
		GrogtalkLexer lexer = new GrogtalkLexer(CharStreams.fromFileName("input/input.txt"));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		GrogtalkParser parser = new GrogtalkParser(tokens);
		ParseTree tree = parser.creature();

		MyVisitor<Object> loader = new MyVisitor<Object>();
		loader.visit(tree);
		toMarkdown(loader.Criatura);
		System.out.println(loader.Criatura.toString());
	}
}
