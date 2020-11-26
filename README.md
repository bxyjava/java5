# java5
实验五模拟学生作业处理

一、实验目的
1、掌握字符串String及其方法的使用；
2、掌握文件的读取/写入方法；
3、掌握异常处理结构。

二、实验过程
1、设计学生类；
2、采用交互式方式实例化某学生；
3、设计程序完成上述的业务逻辑处理，并且把“古诗处理后的输出”结果存储到学生基本信息所在的文本文件A中。
文件A包括两部分内容：
一是学生的基本信息；
二是学生处理后的作业信息，该作业的业务逻辑内容是：利用已学的字符串处理知识编程完成《长恨歌》古诗的整理对齐工作，写出功能方法，实现如下功能：
每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”
允许提供输入参数，统计古诗中某个字或词出现的次数
输入的文本来源于文本文件B读取，把处理好的结果写入到文本文件A
考虑操作中可能出现的异常，在程序中设计异常处理程序

三、核心方法
文件的读取：
public class d {
	private static Scanner in;
	private static Scanner x;
    public static void main(String[] args) {
    	try {
        StringBuffer sb = new StringBuffer();
        String sourcePath = "C:\\Users\\xmz\\Desktop\\文本文件B.txt";//源文件路径(*.*)
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(sourcePath));
            String str;
            while((str = br.readLine()) != null) {//逐行读取
                sb.append(str);
文件的写入：
        String targetPath = "C:\\Users\\xmz\\Desktop\\文本文件A.txt";//目标文件路径
        File f = new File(targetPath);//新建文件
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(f));
            bw.write(sb.toString());
            bw.flush();
            bw.close();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        in = new Scanner(System.in);
异常处理：        
public class AException extends Exception {
    AException(){
        super();
    }
}
四、实验结果
输入：汉皇重色思倾国御宇多年求不得杨家有女初长成养在深闺人未识天生丽质难自弃一朝选在君王侧回眸一笑百媚生
六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝脂侍儿扶起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉帐暖度春宵春宵苦短日高起
从此君王不早朝承欢侍宴无闲暇春从春游夜专夜后宫佳丽三千人三千宠爱在一身金屋妆成娇侍夜玉楼宴罢醉和春姊妹弟兄皆列士
可怜光采生门户遂令天下父母心不重生男重生女骊宫高处入青云仙乐风飘处处闻缓歌慢舞凝丝竹尽日君王看不足渔阳鼙鼓动地来惊破霓裳羽衣曲九重城阙烟尘生千乘万骑西南行

输出：
汉皇重色思倾国，御宇多年求不得。
杨家有女初长成，养在深闺人未识。
天生丽质难自弃，一朝选在君王侧。
回眸一笑百媚生，六宫粉黛无颜色。
春寒赐浴华清池，温泉水滑洗凝脂。
侍儿扶起娇无力，始是新承恩泽时。
云鬓花颜金步摇，芙蓉帐暖度春宵。
春宵苦短日高起，从此君王不早朝。

五、实验感想
该实验让我更加深入的了解了字符串String及其方法的使用，能够掌握并运用文件的读取/写入方法和掌握异常处理结构在实验中。通过此次实验，让我对理论方面的知识有了更深层次的理解。
