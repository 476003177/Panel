package Qq;
import java.awt.*;
import javax.swing.*;
public class qq extends JFrame{
	//�������
	int jpsize=4;                                       //������
	int jlbsize=5;                                      //��ǩ�����
	int jtfsize=1;                                      //�ı������
	int jpfsize=1;                                      //��������
	int jtasize=1;                                      //�����ı������
	int jrbsize=2;                                      //��ѡ�����
	int jcbsize=2;                                      //��ѡ�����
	int jcbbsize=2;                                     //���������
	int jlsize=2;                                       //�б�������һ������б��+������������ʹ��
	int jspsize=2;                                      //�����������
	int jsppsize=1;                                     //��ִ��ڸ���
	int jtpsize=1;                                      //ѡ��������
	int jbsize=4;                                       //��ť����
	JPanel jps[]=new JPanel[jpsize];                    //����������,Ĭ����ʽ����
	JLabel jlbs[]=new JLabel[jlbsize];                  //�����ǩ��
	JTextField jtfs[]=new JTextField[jtfsize];          //�����ı���
	JPasswordField jpfs[]=new JPasswordField[jpfsize];  //���������
	JTextArea jtas[]=new JTextArea[jtasize];            //��������ı���
	JRadioButton jrbs[]=new JRadioButton[jrbsize];      //���嵥ѡ��
	ButtonGroup bg;                                     //���尴ť�飬ͬһ�鵥ѡ��ť����Ž�ButtonGroup����ͳһ����
	JCheckBox jcbs[]=new JCheckBox[jcbsize];            //���帴ѡ��
	JComboBox jcbbs[]=new JComboBox[jcbbsize];          //�����б��
	JList jls[]=new JList[jlsize];                      //�����б��
	JScrollPane jsps[]=new JScrollPane[jspsize];        //�����������
	JSplitPane jspps[]=new JSplitPane[jsppsize];        //�����ִ���
	JTabbedPane jtps[]=new JTabbedPane[jtpsize];        //����ѡ�����
	JButton jbs[]=new JButton[jbsize];                  //���尴ť
	public static void main(String[] args) {
		qq qq1=new qq();
	}
	public qq()//���캯��
	{
		//�������
		for(int i=0;i<jpsize;i++)
		{
			jps[i]=new JPanel();                        //����JPanel���
		}  
		jps[2].setBackground(Color.RED);                //���ñ���ɫ
		jps[3].setBackground(new Color(0,0,255));       //�����Զ��屳��ɫ
		
		
		for(int i=0;i<jlbsize;i++)
		{
			jlbs[i]=new JLabel(String.valueOf(i),JLabel.CENTER);//����JLabel��ǩ�򣬲�����Ӧ���ת��Ϊ�ַ�z��֮��������
		}
		jlbs[0]=new JLabel(new ImageIcon("images/tou.gif"));//����ͼƬ��JLabel��ǩ��
		jlbs[1]=new JLabel("QQ����",JLabel.CENTER);
		jlbs[2]=new JLabel("QQ����",JLabel.CENTER);
		jlbs[3]=new JLabel("��������",JLabel.CENTER);
		jlbs[3].setFont(new Font("����",Font.PLAIN,16)); //����������ʽ
		jlbs[3].setForeground(Color.BLUE);              //����������ɫ
		//jlbs[4]=new JLabel("<html><a href='www.qq.com'>�������뱣��</a>");//��ҳ����
		jlbs[4]=new JLabel("�������뱣��",JLabel.CENTER);
		jlbs[4].setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));//�ƶ������ı�������Ϊ����
		
		jtfs[0]=new JTextField(10);                     //����JTextField�ı���
		
		jpfs[0]=new JPasswordField(10);                 //����JPasswordField�����
		
		jtas[0]=new JTextArea();                        //����JTextArea�����ı���
		
		for(int i=0;i<jrbsize;i++)
		{
			jrbs[i]=new JRadioButton(String.valueOf(i));//����JRadioButton��ѡ��
		}
		ButtonGroup bg=new ButtonGroup();               //����ButtonGroup��ť��
		for(int i=0;i<jrbsize;i++)
		{
			bg.add(jrbs[i]);;                           //����ѡ��Ž���ť��
		}
		
		for(int i=0;i<jcbsize;i++)
		{
			jcbs[i]=new JCheckBox(String.valueOf(i));   //����JCheckBo��ѡ��
		}
		jcbs[0]=new JCheckBox("�����½");
		jcbs[1]=new JCheckBox("��ס����");
		
		String []jg={"����","�Ϻ�","���","����"};
		jcbbs[0]=new JComboBox(jg);                     //����JComboBox�����򣬲���ֵ
		
		String []dd={"��կ��","�ʹ�","����","�찲��"};
		jls[0]=new JList(dd);                           //����JList�б�򣬲���ֵ
		jls[0].setVisibleRowCount(2);                   //����JList�б��ɼ�ѡ��
		
		//jsps[0]=new JScrollPane(jls[0]);                //����JScrollPane�����򣬲����б����� 
		jsps[0] =new JScrollPane(jtas[0]);               //����JScrollPane�����򣬲��Ѷ����ı������
		
		jspps[0]=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,jls[0],jlbs[0]);//������ִ��ڣ������б��ͱ�ǩ�����
		jspps[0].setOneTouchExpandable(true);           //���ÿ���չ
		
		jtps[0]=new JTabbedPane();                      //����ѡ�����
		
		for(int i=0;i<jbsize;i++)
		{
			jbs[i]=new JButton(String.valueOf(i)  );    //����JButton��ť��������Ӧ���ת��Ϊ�ַ���֮
		}
		jbs[0]=new JButton(new ImageIcon("images/denglu.gif"));//������ť��������ͼƬ
		jbs[1]=new JButton(new ImageIcon("images/quxiao.gif"));
		jbs[2]=new JButton(new ImageIcon("images/xiangdao.gif"));
		jbs[3]=new JButton(new ImageIcon("images/clear.gif"));
		
		
		//���ò��ֹ�������JFrameĬ��Ϊ�߽粼��
		//this.setLayout(new FlowLayout(FlowLayout.LEFT));//��ʽ����
		//this.setLayout(new GridLayout(3,1,0,0));        //���񲼾�,�У��У����¼�϶�����Ҽ�϶
		jps[1].setLayout(new GridLayout(3,3));          //������岼��
		
		//������
		//jps[0].add(jlbs[0]);                            //���뵽���
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
		
		jtps[0].add("QQ����",jps[1]);                     //�������뵽ѡ���ѡ����ƣ����
		jtps[0].add("�ֻ�����",jps[2]);
		jtps[0].add("��������",jps[3]);
		
		//for(int i=0;i<jpsize;i++)
		//{
		//	this.add(jps[i]);                           //���뵽JFrame
		//}
		this.add(jps[0],BorderLayout.SOUTH);
		this.add(jlbs[0],BorderLayout.NORTH);
		this.add(jtps[0],BorderLayout.CENTER);
		//this.add(jspps[0]);                           //��ִ��ڼ��뵽JFrame
		
		
		//��ʼ��
		this.setTitle("��ѶQQ");                             //���ô������
		this.setIconImage((new ImageIcon("images/qq.gif")).getImage());//����ͼ��
		this.setSize(350, 240);                         //������Ϊ��λ���ô��峤��	
		this.setLocation(200,200);                      //���ó��Ժ���λ��
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//���ùرմ��ڼ��˳�
		this.setResizable(false);                       //��ֹ�û��ı䴰���С
		this.setVisible(true);                          //��ʾ
	} 
}
