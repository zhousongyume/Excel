package org.java.jxl;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.java.pojo.User;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.Number;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class App {
		public static void main(String[] args) throws IOException, RowsExceededException, WriteException {
			//����һ��������
		WritableWorkbook workbook =Workbook.createWorkbook(new File("d://test.xls"));
		//�ٴ���һ��������
		WritableSheet sheet =workbook.createSheet("������", 0);
		//-------------------------------
		//ģ�����ݿ��ѯ
		List<User> list =App.getUserList();
		for (int i = 0; i < list.size(); i++) {
			//ȡ���û�����
			User user =list.get(i);
			//������һ����Ԫ��
			Number cell1=new Number(0,i,user.getId());
			//���
			sheet.addCell(cell1);
			
			Label cell2 =new Label(1, i, user.getName());
			sheet.addCell(cell2);
			
			Label cell3=new Label(2, i,user.getAddress());
			sheet.addCell(cell3);
			
			Label cell4=new Label(3, i,user.getAddress());
			sheet.addCell(cell4);
			
			
		}
		//-----------------------------
		//д��
		workbook.write();
		//һ��Ҫ�ر�����Ҫ��Ȼ���ݲ���д��
		workbook.close();
		
		
		}
		
		public static List <User> getUserList(){
			List<User> list =new ArrayList<User>();
			list.add(new User(1,"����","�人����"));
			list.add(new User(1,"����","�人����"));
			list.add(new User(1,"����","�人����"));
			return list;
			
		}
}
