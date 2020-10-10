package java.src.java01;

/**
 * @author wzw
 * @create 2020-10-05 19:12
 * @email 2405181714@qq.com
 */
public class Unicode {
	//字符-字符集=字符编码
	//字符：一种符号
	//字符集：多个字符的组合
	//字符编码：字符的组成规则


	//以Byte order mark 开头，表示文本文件开始的几个并不表示任何字符的字节

	/*
	比如：UTF-8 0XEF 0XBB不代表任何文字
	* */
	/*
	 * ASCII计算机刚开始发明的时候，是来解决数字问题，所以ASCII码表示有限，只有255
	 * */

	//OEM字符集
	/*
	对ASCII的后一字节的扩展
	* */

	//多字节字符集
	//GBK中文字符集，两字节代表一个汉字
	/*
	 *
	 * GBK！解码规则：
	 * 如果遇到的字节最高位是0的话，那就用ASCII码解码，比如01000003
	 * 就是单字节解码，因为原先就是用一字节前7位进行字符编码
	 *
	 * 如果遇到的字节的最高位是1，代表原先的ACII不能在表示，就需要用到多字节编码
	 * 则中文用两个字节，对应一个字符
	 * 比如：11001110
	 *
	 * 例子：我叫ABC 前面多字节 后面单字节
	 *   1100111011010010我1011110111010000叫，01000001A01000002B01000003C
	 *
	 * */

	//全角：是一种电脑字符，，占用两个标准字符，通常的键盘字母代表半角，一个字节


	//Unicode：全人类的所有字符
	/*
	唯一的字符码 unique code Unicode

	unicode字符集将所有的字符按照使用的频繁度划分17个层面，每个层面是2的16次方
	65535

	unicode字符编码不和以前的ASCLL GBK那样字符集=编码方式
	而是变化的

	Unicode的缺点
	1.无法区分Ascii编码方式
	2.一个英文字母只需一个自己表示，浪费空间
	3.如果和GBK编码方式，因为有很多值无法用于表示字符，比如0111，就那个位置不行


	UTF-8解决了这个问题
	它是一种变长的编码方式。。他可以用1-4字节表示一个字符。


	Unicode 到UTF-8需要一些规则

	规则：
	前一个字节0000 0000 0000 007F|兼容ASCII
	0000 0080 0000 07FF|
	一字节0xxxxxxxx
	二字节110xxxxx 10xxxxxx
	三字节1110xxxx 10xxxxxx 10xxxxxx
	四字节11110xxxx 10xxxxxx 10xxxxxx 10xxxxxx


	先从Unicode编码 生成二进制 ，然后再用一字节去转换变成UTF-8
	比如：23578 十六进制5C1A 二进制0101 1100 0001 1010
	去补位因为是双字节。找规则匹配  1110xxxx 10xxxxxx 10xxxxxx对应
	则变成1110 0101 1011 0000 1001 1010
	再用单字节8byte解码变成e5 b0 9a


	因此Unicode只是定义了一个全球通用的字符集，并为每个字符规定唯一确定的编号，具体存储什么样的字节流
	取决字符编码方案

	Unicode对UTF-8/16的统称
	* */

}