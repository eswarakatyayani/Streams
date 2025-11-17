public class Main
{
	public static void main(String[] args) {
    
	  //length of strings
		List<String> l=Arrays.aslist("Kat","Katy","Katyayani");
		Stream<String> s=l.stream()
		                   .map(String::length)
		                   .collect(Collectors.toList());
		
		//Even Numbers
		List<Integer> li=Arrays.aslist(1,2,3,4,5,6);
		Stream<String> s1=li.stream()
		                    .filter(n->n%2==0)
		                    .collect(Collectors.toList());
	}
}
