class equalArr
{
	public static void main(String[] args)
	{
		String[] s1 = {"java", "sql", "qae", "hello"};

		String[] s2 = {"jsp", "spring", "jdbc", "hello"};

		String[] s3 = {"java", "sql", "qae", "hello"};

		System.out.println(Arrays.equals(s1, s2));        

		System.out.println(Arrays.equals(s1, s3));      
	}
}