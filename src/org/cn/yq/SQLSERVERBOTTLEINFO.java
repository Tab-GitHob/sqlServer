package org.cn.yq;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SQLSERVERBOTTLEINFO {

	// private static String url =
	// "jdbc:odbc://localhost:6088;DatabaseName=GQSOFT";
	private static String url = "jdbc:microsoft:sqlserver://localhost:6088;DatabaseName=GasManager";

	private static String user = "sa";// system为登陆oracle数据库的用户名

	private static String password = "power";// manager为用户名system的密码

	public static Connection getConnection() {
		try {
			// 初始化驱动包
			Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver");
			// 根据数据库连接字符，名称，密码给conn赋值
			Connection conn = DriverManager.getConnection(url, user, password);
			return conn;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) throws SQLException {
		Date date = new Date();
		GasBottleInfo info = new GasBottleInfo();
		info.setBottleID(1486);
		info.setBottleLabelNo("4401001000000C64");
		info.setManufacturer("广沙百福");
		info.setEnterpriseSteelNo("44CXH003760");
		info.setManufacturerNo("004-904");
		info.setProductionDate(date);
		info.setLastTestDate(date);
		info.setNextTestDate(date);
		info.setInvalidDate(date);
		info.setUseStatus("正常");
		info.setFillingStatus("充装");
		info.setWeight(11.0);
		info.setUpdateDate(date);
		info.setStandard("YSP118");

		boolean f  = isBottleInfo(info);
		if(f)
			update(info);
		else 
			insert(info);
	}

	public static void insert(GasBottleInfo info) throws SQLException {
		Connection conn = getConnection();
		Statement statement = conn.createStatement();

		String sql = insertSql(info);
		int i = statement.executeUpdate(sql.substring(0, sql.length() - 1) + ")");
		System.out.println("新增数据：" + i + " 条！");

		statement.close();
		conn.close();
	}
	
	public static void update(GasBottleInfo info) throws SQLException {
		Connection conn = getConnection();
		Statement statement = conn.createStatement();

		String sql = updateSql(info);
		int i = statement.executeUpdate(sql.substring(0, sql.length() - 1) + " where sID = '" + info.getBottleID() + "'");
		System.out.println("更新数据：" + i + " 条！");

		statement.close();
		conn.close();
	}

	/**
	 * 查气瓶是否存在
	 * 
	 * @param entity
	 * @return
	 * @throws SQLException
	 */
	public static boolean isBottleInfo(GasBottleInfo entity) throws SQLException {
		Connection conn = getConnection();
		Statement statement = conn.createStatement();

		boolean f = false;
		String sql = "select * from QiPing where sID = '" + entity.getBottleID() + "'";
//		sql = "select * from QiPing";

		ResultSet rs = statement.executeQuery(sql);

		while (rs.next()) {
			String id = rs.getString("id");
			String sID = rs.getString("sID");
			String qrCode = rs.getString("Qrcode");
			String cylinderTypeName = rs.getString("cylinderTypeName");
			String mediumName = rs.getString("mediumName");
			String factoryName = rs.getString("factoryName");
			String ownNumber = rs.getString("ownNumber");
			String factoryNumber = rs.getString("factoryNumber");
			String factoryDate = rs.getString("factoryDate");
			String lastInspectDate = rs.getString("lastInspectDate");
			String nextInspectDate = rs.getString("nextInspectDate");
			String scrappedDate = rs.getString("scrappedDate");
			String status = rs.getString("status");
			String fillingStatus = rs.getString("fillingStatus");
			String djWeight = rs.getString("djWeight");
			String Standard = rs.getString("Standard");
			String modelNumber = rs.getString("modelNumber");
			String internalTime = rs.getString("internalTime");
			System.out.println("气瓶ID：" + sID + " 气瓶标签：" + qrCode + " 钢码类型：" + cylinderTypeName + " 充装介质：" + mediumName
					+ " 生产厂家：" + factoryName + " 出厂编号：" + factoryNumber + " 出厂时间：" + factoryDate + " 企业钢码：" + ownNumber
					+ " 上次检测时间：" + lastInspectDate + " 下次检测时间：" + nextInspectDate + " 报废时间：" + scrappedDate + " 使用状态："
					+ status + " 充装状态：" + fillingStatus + " 瓶重：" + djWeight + " 规格：" + Standard + " 容积：" + modelNumber
					+ " 变动时间：" + internalTime);
			f = true;
		}

		rs.close();
		statement.close();
		conn.close();

		return f;
	}

	public static String updateSql(GasBottleInfo entity) {

		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		StringBuffer sf = new StringBuffer();
		sf.append("update QiPing set ");
		sf.append("sID='").append(entity.getBottleID()).append("',");// 我们服务器气瓶ID
		sf.append("Qrcode='").append(entity.getBottleLabelNo()).append("',");// 二维码明文16位
		sf.append("cylinderTypeName='").append("液化石油气钢瓶").append("',");// 钢瓶类型，固定是“液化石油气钢瓶”
		sf.append("mediumName='").append("液化石油气").append("',");// 充装介质，固定是“液化石油气”
		sf.append("factoryName='").append(entity.getManufacturer()).append("',");// 生产厂家
		sf.append("ownNumber='").append(entity.getEnterpriseSteelNo()).append("',");// 企业钢码
		sf.append("factoryNumber='").append(entity.getManufacturerNo()).append("',");// 出厂编号

		if (entity.getProductionDate() != null)
			sf.append("factoryDate='").append(df.format(entity.getProductionDate())).append("',");// 出厂日期
		else
			sf.append("factoryDate='").append("").append("',");// 出厂日期

		if (entity.getLastTestDate() != null)
			sf.append("lastInspectDate='").append(df.format(entity.getLastTestDate())).append("',");// 上次检测日期
		else
			sf.append("lastInspectDate='").append("").append("',");// 上次检测日期

		if (entity.getNextTestDate() != null)
			sf.append("nextInspectDate='").append(df.format(entity.getNextTestDate())).append("',");// 下次检测日期
		else
			sf.append("nextInspectDate='").append("").append("',");// 下次检测日期

		if (entity.getInvalidDate() != null)
			sf.append("scrappedDate='").append(df.format(entity.getInvalidDate())).append("',");// 报废日期
		else
			sf.append("scrappedDate='").append("").append("',");// 报废日期

		sf.append("status='").append(entity.getUseStatus()).append("',");// 使用状态
		sf.append("fillingStatus='").append(entity.getFillingStatus()).append("',");// 充装状态
		sf.append("djWeight=").append(entity.getWeight()).append(",");// 登记瓶重
		sf.append("Standard='").append(entity.getStandard()).append("',");// 规格，如YSP118

		if (entity.getStandard() != null && !"".equals(entity.getStandard())) {
			String str = entity.getStandard();
			int index = str.indexOf("YSP");
			if (index >= 0) {
				index = index + 3;
				int l = Integer.valueOf(str.substring(index, str.length()));
				sf.append("modelNumber=").append(l).append(",");// 容积，例如118
			}
		}

		if (entity.getUpdateDate() != null)
			sf.append("internalTime='").append(df1.format(entity.getUpdateDate())).append("',");// 出厂日期
		else
			sf.append("internalTime='").append("").append("',");// 出厂日期

		return sf.toString();
	}

	public static String insertSql(GasBottleInfo entity) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		StringBuffer sf = new StringBuffer();

		sf.append("insert into QiPing ");
		sf.append(
				"(sID,Qrcode,cylinderTypeName,mediumName,factoryName,ownNumber,factoryNumber,factoryDate,lastInspectDate,nextInspectDate,scrappedDate,status,fillingStatus,djWeight,Standard,modelNumber,internalTime)");
		sf.append(" values ");
		sf.append(" ( ");
		sf.append("'").append(entity.getBottleID()).append("',");// 我们服务器气瓶ID

		sf.append("'").append(entity.getBottleLabelNo()).append("',");// 二维码明文16位
		sf.append("'").append("液化石油气钢瓶").append("',");// 钢瓶类型，固定是“液化石油气钢瓶”
		sf.append("'").append("液化石油气").append("',");// 充装介质，固定是“液化石油气”
		sf.append("'").append(entity.getManufacturer()).append("',");// 生产厂家
		sf.append("'").append(entity.getEnterpriseSteelNo()).append("',");// 企业钢码
		sf.append("'").append(entity.getManufacturerNo()).append("',");// 出厂编号

		if (entity.getProductionDate() != null)
			sf.append("'").append(df.format(entity.getProductionDate())).append("',");// 出厂日期
		else
			sf.append("'").append("").append("',");// 出厂日期

		if (entity.getLastTestDate() != null)
			sf.append("'").append(df.format(entity.getLastTestDate())).append("',");// 上次检测日期
		else
			sf.append("'").append("").append("',");// 上次检测日期

		if (entity.getNextTestDate() != null)
			sf.append("'").append(df.format(entity.getNextTestDate())).append("',");// 下次检测日期
		else
			sf.append("'").append("").append("',");// 下次检测日期

		if (entity.getInvalidDate() != null)
			sf.append("'").append(df.format(entity.getInvalidDate())).append("',");// 报废日期
		else
			sf.append("'").append("").append("',");// 报废日期

		sf.append("'").append(entity.getUseStatus()).append("',");// 使用状态
		sf.append("'").append(entity.getFillingStatus()).append("',");// 充装状态
		sf.append(entity.getWeight()).append(",");// 登记瓶重
		sf.append("'").append(entity.getStandard()).append("',");// 规格，如YSP118

		if (entity.getStandard() != null && !"".equals(entity.getStandard())) {
			String str = entity.getStandard();
			int index = str.indexOf("YSP");
			if (index >= 0) {
				index = index + 3;
				int l = Integer.valueOf(str.substring(index, str.length()));
				sf.append(l).append(",");// 容积，例如118
			} else
				sf.append(0).append(",");// 容积，例如118
		} else
			sf.append(0).append(",");// 容积，例如118

		if (entity.getUpdateDate() != null)
			sf.append("'").append(df1.format(entity.getUpdateDate())).append("',");// 出厂日期
		else
			sf.append("'").append("").append("',");// 出厂日期

		return sf.toString();
	}

}
