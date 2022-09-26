//位运算

public class BitOperator {
	//编写一个main方法
	public static void main(String[] args) {
		//在计算机中，所有运算都是以补码进行的
		//结果都是以原码显示
		
		
		//逻辑与 &
		System.out.println(2&3);// 2
		//分析
		//2 和 3 都是 int型，所以是4位，32个字节
		//1. 先得到 2 的补码 => 2的原码 00000000 00000000 00000000 00000010
		//   2的补码 00000000 00000000 00000000 00000010
		//2. 3的补码 3 的 原码 00000000 00000000 00000000 00000011
		//   3的补码 00000000 00000000 00000000 00000011
		//3. 按位 &
		//   00000000 00000000 00000000 00000010
		// & 00000000 00000000 00000000 00000011
		// = 00000000 00000000 00000000 00000010（& 运算后的补码）
		// 运算后的原码也是 00000000 00000000 00000000 00000010
		// 结果就是 2
		

		//逻辑或 |
		System.out.println(2|3);// 3
		//分析
		//2 和 3 都是 int型，所以是4位，32个字节
		//1. 先得到 2 的补码 => 2的原码 00000000 00000000 00000000 00000010
		//   2的补码 00000000 00000000 00000000 00000010
		//2. 3的补码 3 的 原码 00000000 00000000 00000000 00000011
		//   3的补码 00000000 00000000 00000000 00000011
		//3. 按位 |
		//   00000000 00000000 00000000 00000010
		// & 00000000 00000000 00000000 00000011
		// = 00000000 00000000 00000000 00000011（| 运算后的补码）
		// 运算后的原码也是 00000000 00000000 00000000 00000011
		// 结果就是 3


		//逻辑异或 ^
		System.out.println(2^3);// 1
		//分析
		//2 和 3 都是 int型，所以是4位，32个字节
		//1. 先得到 2 的补码 => 2的原码 00000000 00000000 00000000 00000010
		//   2的补码 00000000 00000000 00000000 00000010
		//2. 3的补码 3 的 原码 00000000 00000000 00000000 00000011
		//   3的补码 00000000 00000000 00000000 00000011
		//3. 按位 &
		//   00000000 00000000 00000000 00000010
		// & 00000000 00000000 00000000 00000011
		// = 00000000 00000000 00000000 00000001（^ 运算后的补码）
		// 运算后的原码也是 00000000 00000000 00000000 00000001
		// 结果就是 1


		//取反 ~
		System.out.println(~-2);// 1
		//分析
		//1. 先得到 -2 的原码 10000000 00000000 00000000 00000010
		//         -2 的反码 11111111 11111111 11111111 11111101
		//         -2 的补码 11111111 11111111 11111111 11111110
		//2. 执行 ~-2 操作   00000000 00000000 00000000 00000001（ 0变1 1变0 ）得到运算后的补码
		//3.运算后的原码 00000000 00000000 00000000 00000001 
		// 结果就是 1   
		
		System.out.println(~2);// -3
		//分析
		//1. 得到2的补码 => 00000000 00000000 00000000 00000010
		//2. 执行 ~2 操作=> 11111111 11111111 11111111 11111101 运算后的补码
		//   运算后的反码=> 11111111 11111111 11111111 11111100  补码 -1
		//   运算后的补码=> 10000000 00000000 00000000 00000011  反码再取反码
		//   结果为 -3 
		//                    

	}
}