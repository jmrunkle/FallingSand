import java.util.Arrays;

public class FallingSand {

	public static String[] simulate(String[] board) {
		return board;
	}

	public static void main(String args[]) {
		// test cases
		String[] board = new String[]{
			"ooooo",
 			"..x..",
 			"....x",
 			".....",
 			"....o"};
 		System.out.println("Board 1 = ");
 		for (String s : board)
 			System.out.println(s);
 		String[] result = simulate(board);
 		String[] solution = new String[]{
 			"..o..",
 			"..x.o",
 			"....x",
 			".....",
 			"oo.oo"};
 		if (Arrays.equals(result, solution))
 			System.out.println("PASS\n");
 		else
 			System.out.println("FAIL\n");

		board = new String[]{
			"..o..",
			"..x.o",
			"....x",
			".....",
			"oo.oo"};
 		System.out.println("Board 2 = ");
 		for (String s : board)
 			System.out.println(s);
 		result = simulate(board);
 		solution = new String[]{
 			"..o..",
 			"..x.o",
 			"....x",
 			".....",
 			"oo.oo"};
 		if (Arrays.equals(result, solution))
 			System.out.println("PASS\n");
 		else
 			System.out.println("FAIL\n");

 		board = new String[]{
			"ooooxooo.ooxo.oxoxoooox.....x.oo"};
 		System.out.println("Board 3 = ");
 		for (String s : board)
 			System.out.println(s);
 		result = simulate(board);
 		solution = new String[]{
 			"ooooxooo.ooxo.oxoxoooox.....x.oo"};
 		if (Arrays.equals(result, solution))
 			System.out.println("PASS\n");
 		else
 			System.out.println("FAIL\n");

 		board = new String[]{
			"o",
			".",
			"o",
			".",
			"o",
			".",
			"."};
 		System.out.println("Board 4 = ");
 		for (String s : board)
 			System.out.println(s);
 		result = simulate(board);
 		solution = new String[]{
 			".",
 			".",
 			".",
 			".",
 			"o",
 			"o",
 			"o"};
 		if (Arrays.equals(result, solution))
 			System.out.println("PASS\n");
 		else
 			System.out.println("FAIL\n");

 		board = new String[]{
			"oxxxxooo",
			"xooooxxx",
			"..xx.ooo",
			"oooox.o.",
			"..x....."};
 		System.out.println("Board 5 = ");
 		for (String s : board)
 			System.out.println(s);
 		result = simulate(board);
 		solution = new String[]{
 			"oxxxxooo",
 			"x.oo.xxx", 
 			"..xxo...", 
 			".oo.x.o.", 
 			"ooxo.ooo"};
 		if (Arrays.equals(result, solution))
 			System.out.println("PASS\n");
 		else
 			System.out.println("FAIL\n");

 		board = new String[]{
			"..o..o..o..o..o..o..o..o..o..o..o",
			"o..o..o..o..o..o..o..o..o..o..o..",
			".o..o..o..o..o..o..o..o..o..o..o.",
			"...xxx...xxx...xxxxxxxxx...xxx...",
			"...xxx...xxx...xxxxxxxxx...xxx...",
			"...xxx...xxx......xxx......xxx...",
			"...xxxxxxxxx......xxx......xxx...",
			"...xxxxxxxxx......xxx......xxx...",
			"...xxxxxxxxx......xxx......xxx...",
			"...xxx...xxx......xxx............",
			"...xxx...xxx...xxxxxxxxx...xxx...",
			"...xxx...xxx...xxxxxxxxx...xxx...",
			"..o..o..o..o..o..o..o..o..o..o..o",
			"o..o..o..o..o..o..o..o..o..o..o..",
			".o..o..o..o..o..o..o..o..o..o..o."};
 		System.out.println("Board 5 = ");
 		for (String s : board)
 			System.out.println(s);
 		result = simulate(board);
 		solution = new String[]{
 			".................................",
 			".................................",
 			"...ooo...ooo...ooooooooo...ooo...",
 			"...xxx...xxx...xxxxxxxxx...xxx...",
 			"...xxx...xxx...xxxxxxxxx...xxx...",
 			"...xxxoooxxx......xxx......xxx...",
 			"...xxxxxxxxx......xxx......xxx...",
 			"...xxxxxxxxx......xxx......xxx...",
 			"...xxxxxxxxx......xxx......xxx...",
 			"...xxx...xxx......xxx............",
 			"...xxx...xxx...xxxxxxxxx...xxx...",
 			"...xxx...xxx...xxxxxxxxx...xxx...",
 			".................................",
 			"ooo.........ooo.........ooo...ooo",
 			"ooooooooooooooooooooooooooooooooo"};
 		if (Arrays.equals(result, solution))
 			System.out.println("PASS\n");
 		else
 			System.out.println("FAIL\n");
	}

}