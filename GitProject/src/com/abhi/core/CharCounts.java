package com.abhi.core;

import java.util.HashSet;

public class CharCounts {
	 public static void main(String[] args) {
			String str="aabbaababababdcbbbbccccddddbaaaa";
			char ch[]=str.toCharArray();
			HashSet<Character> hs=new HashSet<>();
			for(int i=0;i<ch.length;i++)
		        hs.add(ch[i]);
			
			System.out.println("total no of char is :"+hs.size());
			
			}
}
