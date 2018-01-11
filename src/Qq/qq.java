package Qq;
import java.awt.*;
import javax.swing.*;
public class qq extends JFrame{
	//定义组件
	int jpsize=4;                                       //面板个数
	int jlbsize=5;                                      //标签框个数
	int jtfsize=1;                                      //文本框个数
	int jpfsize=1;                                      //密码框个数
	int jtasize=1;                                      //多行文本框个数
	int jrbsize=2;                                      //单选框个数
	int jcbsize=2;                                      //复选框个数
	int jcbbsize=2;                                     //下拉框个数
	int jlsize=2;                                       //列表框个数，一般而言列表框+滚动窗格配套使用
	int jspsize=2;                                      //滚动窗格个数
	int jsppsize=1;                                     //拆分窗口个数
	int jtpsize=1;                                      //选项卡窗格个数
	int jbsize=4;                                       //按钮个数
	JPanel jps[]=new JPanel[jpsize];                    //定义面板组件,默认流式布局
	JLabel jlbs[]=new JLabel[jlbsize];                  //定义标签框
	JTextField jtfs[]=new JTextField[jtfsize];          //定义文本框
	JPasswordField jpfs[]=new JPasswordField[jpfsize];  //定义密码框
	JTextArea jtas[]=new JTextArea[jtasize];            //定义多行文本框
	JRadioButton jrbs[]=new JRadioButton[jrbsize];      //定义单选框
	ButtonGroup bg;                                     //定义按钮组，同一组单选按钮必须放进ButtonGroup进行统一管理
	JCheckBox jcbs[]=new JCheckBox[jcbsize];            //定义复选框
	JComboBox jcbbs[]=new JComboBox[jcbbsize];          //定义列表框
	JList jls[]=new JList[jlsize];                      //定义列表框
	JScrollPane jsps[]=new JScrollPane[jspsize];        //定义滚动窗格
	JSplitPane jspps[]=new JSplitPane[jsppsize];        //定义拆分窗口
	JTabbedPane jtps[]=new JTabbedPane[jtpsize];        //定义选项卡窗格
	JButton jbs[]=new JButton[jbsize];                  //定义按钮
	public static void main(String[] args) {
		qq qq1=new qq();
	}
	public qq()//构造函数
	{
		//创建组件
		for(int i=0;i<jpsize;i++)
		{
			jps[i]=new JPanel();                        //创建JPanel面板
		}  
		jps[2].setBackground(Color.RED);                //设置背景色
		jps[3].setBackground(new Color(0,0,255));       //设置自定义背景色
		
		
		for(int i=0;i<jlbsize;i++)
		{
			jlbs[i]=new JLabel(String.valueOf(i),JLabel.CENTER);//创建JLabel标签框，并把相应序号转换为字符z赋之以正中央
		}
		jlbs[0]=new JLabel(new ImageIcon("images/tou.gif"));//插入图片进JLabel标签框
		jlbs[1]=new JLabel("QQ号码",JLabel.CENTER);
		jlbs[2]=new JLabel("QQ密码",JLabel.CENTER);
		jlbs[3]=new JLabel("忘记密码",JLabel.CENTER);
		jlbs[3].setFont(new Font("宋体",Font.PLAIN,16)); //设置字体样式
		jlbs[3].setForeground(Color.BLUE);              //设置字体颜色
		//jlbs[4]=new JLabel("<html><a href='www.qq.com'>申请密码保护</a>");//网页链接
		jlbs[4]=new JLabel("申请密码保护",JLabel.CENTER);
		jlbs[4].setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));//移动至该文本框鼠标变为手型
		
		jtfs[0]=new JTextField(10);                     //创建JTextField文本框
		
		jpfs[0]=new JPasswordField(10);                 //创建JPasswordField密码框
		
		jtas[0]=new JTextArea();                        //创建JTextArea多行文本框
		
		for(int i=0;i<jrbsize;i++)
		{
			jrbs[i]=new JRadioButton(String.valueOf(i));//创建JRadioButton单选框
		}
		ButtonGroup bg=new ButtonGroup();               //创建ButtonGroup按钮组
		for(int i=0;i<jrbsize;i++)
		{
			bg.add(jrbs[i]);;                           //将单选框放进按钮组
		}
		
		for(int i=0;i<jcbsize;i++)
		{
			jcbs[i]=new JCheckBox(String.valueOf(i));   //创建JCheckBo复选框
		}
		jcbs[0]=new JCheckBox("隐身登陆");
		jcbs[1]=new JCheckBox("记住密码");
		
		String []jg={"北京","上海","天津","火星"};
		jcbbs[0]=new JComboBox(jg);                     //创建JComboBox下拉框，并赋值
		
		String []dd={"九寨沟","故宫","长城","天安门"};
		jls[0]=new JList(dd);                           //创建JList列表框，并赋值
		jls[0].setVisibleRowCount(2);                   //设置JList列表框可见选项
		
		//jsps[0]=new JScrollPane(jls[0]);                //创建JScrollPane滚动框，并把列表框放入 
		jsps[0] =new JScrollPane(jtas[0]);               //创建JScrollPane滚动框，并把多行文本框放入
		
		jspps[0]=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,jls[0],jlbs[0]);//创建拆分窗口，并把列表框和标签框放入
		jspps[0].setOneTouchExpandable(true);           //设置可收展
		
		jtps[0]=new JTabbedPane();                      //创建选项卡窗格
		
		for(int i=0;i<jbsize;i++)
		{
			jbs[i]=new JButton(String.valueOf(i)  );    //创建JButton按钮，并把相应序号转换为字符赋之
		}
		jbs[0]=new JButton(new ImageIcon("images/denglu.gif"));//创建按钮，并插入图片
		jbs[1]=new JButton(new ImageIcon("images/quxiao.gif"));
		jbs[2]=new JButton(new ImageIcon("images/xiangdao.gif"));
		jbs[3]=new JButton(new ImageIcon("images/clear.gif"));
		
		
		//设置布局管理器，JFrame默认为边界布局
		//this.setLayout(new FlowLayout(FlowLayout.LEFT));//流式布局
		//this.setLayout(new GridLayout(3,1,0,0));        //网格布局,行，列，上下间隙，左右间隙
		jps[1].setLayout(new GridLayout(3,3));          //设置面板布局
		
		//添加组件
		//jps[0].add(jlbs[0]);                            //加入到面板
		jps[0].add(jbs[0]);
		jps[0].add(jbs[1]);
		jps[0].add(jbs[2]);
		jps[1].add(jlbs[1]);
		jps[1].add(jtfs[0]);
		jps[1].add(jbs[3]);
		jps[1].add(jlbs[2]);
		jps[1].add(jpfs[0]);
		jps[1].add(jlbs[3]);
		jps[1].add(jcbs[0]);
		jps[1].add(jcbs[1]);
		jps[1].add(jlbs[4]);
		
		jtps[0].add("QQ号码",jps[1]);                     //将面板加入到选项卡，选项卡名称，面板
		jtps[0].add("手机号码",jps[2]);
		jtps[0].add("电子邮箱",jps[3]);
		
		//for(int i=0;i<jpsize;i++)
		//{
		//	this.add(jps[i]);                           //加入到JFrame
		//}
		this.add(jps[0],BorderLayout.SOUTH);
		this.add(jlbs[0],BorderLayout.NORTH);
		this.add(jtps[0],BorderLayout.CENTER);
		//this.add(jspps[0]);                           //拆分窗口加入到JFrame
		
		
		//初始化
		this.setTitle("腾讯QQ");                             //设置窗体标题
		this.setIconImage((new ImageIcon("images/qq.gif")).getImage());//设置图标
		this.setSize(350, 240);                         //以像素为单位设置窗体长宽	
		this.setLocation(200,200);                      //设置初试横纵位置
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置关闭窗口即退出
		this.setResizable(false);                       //禁止用户改变窗体大小
		this.setVisible(true);                          //显示
	} 
}
