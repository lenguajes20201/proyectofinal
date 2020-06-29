import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Interpreter {



	public void toMarkdown ( Creature criatura){
		Creature c = criatura;
		String result = "___\n";
		result.concat("> ## "+c.getName()+"\n");
		result.concat(String.format("> *%s %s %s, %s*\n",c.getSize(), c.getType(), c.getTagsString(), c.getAlignment()));
		result.concat("> ___\n");
		result.concat(String.format("> - **Armor Class** %s\n", c.getArmorClass()));
		result.concat(String.format("> - **Hit Points** %s\n", c.getHitPoints()));
		result.concat(String.format("> - **Hit Points** %s\n", c.getHitPoints()));




	}

	public static void main(String [] args) throws Exception{
		GrogtalkLexer lexer = new GrogtalkLexer(CharStreams.fromFileName("input/input.txt"));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		GrogtalkParser parser = new GrogtalkParser(tokens);
		ParseTree tree = parser.creature();

		MyVisitor<Object> loader = new MyVisitor<Object>();
		loader.visit(tree);
		System.out.println(loader.Criatura.toString());
	}
}
