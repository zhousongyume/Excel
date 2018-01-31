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
			//创建一个工作簿
		WritableWorkbook workbook =Workbook.createWorkbook(new File("d://test.xls"));
		//再创建一个工作表
		WritableSheet sheet =workbook.createSheet("周松宇", 0);
		//-------------------------------
		//模拟数据库查询
		List<User> list =App.getUserList();
		for (int i = 0; i < list.size(); i++) {
			//取出用户对象
			User user =list.get(i);
			//创建第一个单元格
			Number cell1=new Number(0,i,user.getId());
			//添加
			sheet.addCell(cell1);
			
			Label cell2 =new Label(1, i, user.getName());
			sheet.addCell(cell2);
			
			Label cell3=new Label(2, i,user.getAddress());
			sheet.addCell(cell3);
			
			Label cell4=new Label(3, i,user.getAddress());
			sheet.addCell(cell4);
			
			
		}
		//-----------------------------
		//写出
		workbook.write();
		//一定要关闭流，要不然数据不会写入
		workbook.close();
		
		
		}
		
		public static List <User> getUserList(){
			List<User> list =new ArrayList<User>();
			list.add(new User(1,"张三","武汉东湖"));
			list.add(new User(1,"张四","武汉东湖"));
			list.add(new User(1,"张五","武汉东湖"));
			return list;
			
		}
}
