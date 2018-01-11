package Jishiben;
import java.awt.*;
import javax.swing.*;
public class jishiben extends JFrame{

	public static void main(String[] args) {
		jishiben jsb1=new jishiben();
	}
	
	//定义组件
	int menusize=6;                                     //菜单组件个数
	int itemsize=8;                                     //菜单项组件个数
	int jbsize=6;                                       //按钮个数
	JMenuBar jmb;                                       //定义菜单条组件
	JMenu menus[]=new JMenu[menusize];                  //定义菜单组件，可嵌套为一级二级三级……		
	JMenuItem items[]=new JMenuItem[itemsize];          //定义菜单项组件
	JToolBar jtb;                                       //定义工具条
	JButton jbs[]=new JButton[jbsize];                  //定义按钮
	JTextArea jta;                                      //定义多行文本框
	JScrollPane jsp;                                    //定义滚动条
			
	public jishiben()
	{
		//创建组件
		jtb=new JToolBar();                             //新建工具条
		jbs[0]=new JButton(new ImageIcon("images/NEW.jpg"));
		jbs[0].setToolTipText("新建");                    //设置提示信息
		jbs[1]=new JButton(new ImageIcon("images/OPEN.jpg"));
		jbs[1].setToolTipText("打开");
		jbs[2]=new JButton(new ImageIcon("images/SAVE.jpg"));
		jbs[2].setToolTipText("保存");
		jbs[3]=new JButton(new ImageIcon("images/COPY.jpg"));
		jbs[3].setToolTipText("复制");
		jbs[4]=new JButton(new ImageIcon("images/CUT.jpg"));
		jbs[4].setToolTipText("剪切");
		jbs[5]=new JButton(new ImageIcon("images/PASTE.jpg"));
		jbs[5].setToolTipText("粘贴");
		
		jmb=new JMenuBar();                              //新建菜单条
		menus[0]=new JMenu("文件（F）");                    //新建菜单组件
		menus[0].setMnemonic('F');                       //设置助记符，即设置快捷键ALT+
		menus[1]=new JMenu("编辑（E）");
		menus[1].setMnemonic('E');
		menus[2]=new JMenu("格式（O）");
		menus[2].setMnemonic('O');
		menus[3]=new JMenu("查看（V）");
		menus[3].setMnemonic('V');
		menus[4]=new JMenu("帮助（H）");
		menus[4].setMnemonic('H');
		menus[5]=new JMenu("新建");		
		items[0]=new JMenuItem("文件");                    //新建菜单项
		items[1]=new JMenuItem("工程");
		items[2]=new JMenuItem("打开",new ImageIcon("Image/new.gif"));//新建菜单项并插入图标
		items[3]=new JMenuItem("保存（S）");
		items[3].setMnemonic('S');
		items[4]=new JMenuItem("另存为");
		items[5]=new JMenuItem("页面保存");
		items[6]=new JMenuItem("打印");
		items[7]=new JMenuItem("退出");
				
		jta=new JTextArea();                              //创建多行文本框
				
		jsp=new JScrollPane(jta);                         //创建滚动条并把多行文本框放入
		jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);//一直存在
				
		//设置布局
				
		
		//添加组件
		for(int i=0;i<jbsize;i++)
		{
			jtb.add(jbs[i]);                               //将按钮添加到工具条上
		}
		
		menus[5].add(items[0]);                             //将菜单项添加到菜单上，形成多级菜单
		menus[5].add(items[1]);
				
		menus[0].add(menus[5]);                            //将二级菜单添加到一级菜单上
		for(int i=0;i<itemsize-2;i++)
		{
			menus[0].add(items[i+2]);
			menus[0].addSeparator();                       //添加分割线
		}
				
		for(int i=0;i<menusize-1;i++)
		{
			jmb.add(menus[i]);                             //将菜单添加到菜单条上
		}
				
		this.setJMenuBar(jmb);                             //将菜单条添加到窗体上
		this.add(jtb,BorderLayout.NORTH);                  //将工具条添加到窗体上
		this.add(jsp);                                     //将滚动条添加到窗体
				
				
		//初始化
		this.setTitle("记事本");                             //设置窗体标题
		this.setSize(500, 300);                         //以像素为单位设置窗体长宽	
		this.setLocation(500,400);                      //设置初试横纵位置
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置关闭窗口即退出
		this.setResizable(false);                       //禁止用户改变窗体大小
		this.setVisible(true);                          //显示
	}
}
