package com.zongxiangyang.demo;

import java.util.Random;

public class RandomUtil01 {

	//方法1：返回min-max之间的随机整数（包含min和max值），例如返回1-3之间的随机数，那么返回1或2或3都是正确的，返回4就不对。 (5分)
	public static int random(int min, int max){
		int num = (int) (Math.random()*(min));
		Random random = new Random();
//		random.doubles(min, max);
//		int sum = random(min, max);
//		int sum = random.longs(min, max)；
		return num;
	}
	//方法2：在最小值min与最大值max之间截取subs个不重复的随机数。例如在1-10之间取3个不重复的随机数，那么[2,6,9]是对的，[3,5,5]则不对，因为5重复了。应用场景：在100篇文章中随机取10篇文章，月考可能会使用到。 (8分)
	public static int[] subRandom (int min, int max, int subs){
		Random random = new Random();
		int num = (int) (Math.random()*(min));
		int[] sum = new int[1] ;
		sum[1] = num;
		return sum ;
	}
	
	//方法3：返回1个1-9,a-Z之间的随机字符。 (8分)
	public static char randomCharacter (){
		
		int num = (int) (Math.random()*(9));
		char sum = (char) ('.'+num+',');
		return sum;
	}
	//方法4：返回参数length个字符串(5分)，方法内部要调用randomCharacter()方法 (4分)
	public static String randomString(int length){
		int num = (int) (Math.random()*(length));
		String sum = num+ "";
		return ","+sum+",";
	}
	
}
