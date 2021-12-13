package EjercicioDebugger;
import java.io.*;
import java.util.StringTokenizer;
public class Ejercicio {
	

	public static class FastReader {
	// Reader object
	BufferedReader reader;

	// Constructor
	public FastReader()
	{
	// Initialize the reader
	reader = new BufferedReader(new InputStreamReader(System.in));
	}

	public FastReader(String fileName) {
	File file = new File(fileName);
	try {
	reader = new BufferedReader(new FileReader(file));
	} catch (IOException e) {
	e.printStackTrace();
	}
	}

	// String tokenizer
	StringTokenizer tokenizer;

	// Function to read integer
	public int readSingleInt()
	throws IOException
	{
	return Integer.parseInt(reader.readLine());
	}

	// Function to read a single long
	public long readSingleLong()
	throws IOException
	{
	return Long.parseLong(reader.readLine());
	}

	// Function to read a array of
	// numsInts integers in 1 line
	public int[] readIntArray(int numInts)
	throws IOException
	{
	int[] nums = new int[numInts];
	tokenizer = new StringTokenizer(reader.readLine());

	// Input Numbers
	for (int i = 0; i < numInts; i++) {
	nums[i] = Integer.parseInt(tokenizer.nextToken());
	}
	return nums;
	}
	public long[] readLongArray(int numLongs)
	throws IOException
	{
	long[] nums = new long[numLongs];
	tokenizer = new StringTokenizer(reader.readLine());

	// Input Numbers
	for (int i = 0; i < numLongs; i++) {
	nums[i] = Long.parseLong(tokenizer.nextToken());
	}
	return nums;
	}

	// Function to read string
	public String readString()
	throws IOException
	{
	return reader.readLine();
	}
	}
	public static void main(String[] args) throws IOException {
	FastReader r = new FastReader("C:\\Users\\ir012982di\\eclipse-workspace\\Programame\\src\\com\\company\\pruebas.txt");

	try {
	int cant = r.readSingleInt();
	String n;
	int n1;
	int n2;

	for (int i=0;i<cant;i++) {
	n = r.readString();
	char[] d = n.toCharArray();
	n1 = d[0]+d[1];
	n2 = d[3]+d[4];
	if (n1%2 == 0 && n1 == n2-1 || n2%2 == 0 && n2 == n1-1) {
	System.out.println("SI");
	}
	else {
	System.out.println("NO");
	}
	}
	}
	catch(IOException e) {
	e.printStackTrace();
	}

	}

	}

