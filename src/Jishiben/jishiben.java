package Jishiben;
import java.awt.*;
import javax.swing.*;
public class jishiben extends JFrame{

	public static void main(String[] args) {
		jishiben jsb1=new jishiben();
	}
	
	//�������
	int menusize=6;                                     //�˵��������
	int itemsize=8;                                     //�˵����������
	int jbsize=6;                                       //��ť����
	JMenuBar jmb;                                       //����˵������
	JMenu menus[]=new JMenu[menusize];                  //����˵��������Ƕ��Ϊһ��������������		
	JMenuItem items[]=new JMenuItem[itemsize];          //����˵������
	JToolBar jtb;                                       //���幤����
	JButton jbs[]=new JButton[jbsize];                  //���尴ť
	JTextArea jta;                                      //��������ı���
	JScrollPane jsp;                                    //���������
			
	public jishiben()
	{
		//�������
		jtb=new JToolBar();                             //�½�������
		jbs[0]=new JButton(new ImageIcon("images/NEW.jpg"));
		jbs[0].setToolTipText("�½�");                    //������ʾ��Ϣ
		jbs[1]=new JButton(new ImageIcon("images/OPEN.jpg"));
		jbs[1].setToolTipText("��");
		jbs[2]=new JButton(new ImageIcon("images/SAVE.jpg"));
		jbs[2].setToolTipText("����");
		jbs[3]=new JButton(new ImageIcon("images/COPY.jpg"));
		jbs[3].setToolTipText("����");
		jbs[4]=new JButton(new ImageIcon("images/CUT.jpg"));
		jbs[4].setToolTipText("����");
		jbs[5]=new JButton(new ImageIcon("images/PASTE.jpg"));
		jbs[5].setToolTipText("ճ��");
		
		jmb=new JMenuBar();                              //�½��˵���
		menus[0]=new JMenu("�ļ���F��");                    //�½��˵����
		menus[0].setMnemonic('F');                       //�������Ƿ��������ÿ�ݼ�ALT+
		menus[1]=new JMenu("�༭��E��");
		menus[1].setMnemonic('E');
		menus[2]=new JMenu("��ʽ��O��");
		menus[2].setMnemonic('O');
		menus[3]=new JMenu("�鿴��V��");
		menus[3].setMnemonic('V');
		menus[4]=new JMenu("������H��");
		menus[4].setMnemonic('H');
		menus[5]=new JMenu("�½�");		
		items[0]=new JMenuItem("�ļ�");                    //�½��˵���
		items[1]=new JMenuItem("����");
		items[2]=new JMenuItem("��",new ImageIcon("Image/new.gif"));//�½��˵������ͼ��
		items[3]=new JMenuItem("���棨S��");
		items[3].setMnemonic('S');
		items[4]=new JMenuItem("���Ϊ");
		items[5]=new JMenuItem("ҳ�汣��");
		items[6]=new JMenuItem("��ӡ");
		items[7]=new JMenuItem("�˳�");
				
		jta=new JTextArea();                              //���������ı���
				
		jsp=new JScrollPane(jta);                         //�������������Ѷ����ı������
		jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);//һֱ����
				
		//���ò���
				
		
		//������
		for(int i=0;i<jbsize;i++)
		{
			jtb.add(jbs[i]);                               //����ť��ӵ���������
		}
		
		menus[5].add(items[0]);                             //���˵�����ӵ��˵��ϣ��γɶ༶�˵�
		menus[5].add(items[1]);
				
		menus[0].add(menus[5]);                            //�������˵���ӵ�һ���˵���
		for(int i=0;i<itemsize-2;i++)
		{
			menus[0].add(items[i+2]);
			menus[0].addSeparator();                       //��ӷָ���
		}
				
		for(int i=0;i<menusize-1;i++)
		{
			jmb.add(menus[i]);                             //���˵���ӵ��˵�����
		}
				
		this.setJMenuBar(jmb);                             //���˵�����ӵ�������
		this.add(jtb,BorderLayout.NORTH);                  //����������ӵ�������
		this.add(jsp);                                     //����������ӵ�����
				
				
		//��ʼ��
		this.setTitle("���±�");                             //���ô������
		this.setSize(500, 300);                         //������Ϊ��λ���ô��峤��	
		this.setLocation(500,400);                      //���ó��Ժ���λ��
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//���ùرմ��ڼ��˳�
		this.setResizable(false);                       //��ֹ�û��ı䴰���С
		this.setVisible(true);                          //��ʾ
	}
}
