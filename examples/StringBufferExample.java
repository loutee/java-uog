// StringBufferExample.java
// Shows usage of a StringBuffer in java

class StringBufferExample {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb);
		System.out.println("Length: " + sb.length() ); // 5
		System.out.println("Capacity: " + sb.capacity() ); // 21
		System.out.println("charAt 1: " + sb.charAt(1) ); // e
		//System.out.println( sb.setCharAt(1,'i') ); // Hillo (not permitted in static
		//System.out.println("setLength(2):" + sb.setLength(2) ); // Hi (not permitted in static
		System.out.println("append l & l: " + sb.append("l").append("l") ); // Hill
		System.out.println("insert Big @ 0: " + sb.insert(0, "Big ") ); // Big Hill
		System.out.println("replace(3, 11, ''): " + sb.replace(3, 11, "") ); // Big
		System.out.println("reverse: " + sb.reverse() ); // giB
	}
}
