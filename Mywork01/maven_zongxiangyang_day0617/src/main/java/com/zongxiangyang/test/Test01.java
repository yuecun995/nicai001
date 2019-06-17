package com.zongxiangyang.test;

import com.zongxiangyang.demo.RandomUtil01;

public class Test01 {

	public static void main(String[] args) {
		// 返回min-max之间的随机整数
		RandomUtil01 util01 = new RandomUtil01();
//		util01.random(3, 9);
//		System.out.println(util01.random(3, 9));
		
		//方法2：在最小值min与最大值max之间截取subs个不重复的随机数
		System.out.println(util01.subRandom(3,9,13));
		
		////方法3：返回1个1-9,a-Z之间的随机字符。 (8分)
//		System.out.println(util01.randomCharacter());
		
		//方法4：返回参数length个字符串(5分)
//		System.out.println(util01.randomString(9));
	}

}
