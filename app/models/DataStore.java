package models;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataStore {

	String driver = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://127.0.0.1:3306/jira";
	String user = "root";
	String password = "root123";

	/**
	 * Recommond not use this method
	 * @author chan
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public String[] getDuration(String startDate, String endDate) {
		Date start = (startDate == null ? Date.valueOf("2012-01-01") : Date.valueOf(startDate));
		Date end = (startDate == null ? Date.valueOf("2999-12-31") : Date.valueOf(endDate));

		String[] result = new String[11];
		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, user, password);
			if (!conn.isClosed())
				System.out.println("Succeeded connecting to the Database!");
			Statement statement = conn.createStatement();
			String query = "select A.issue, A.stringvalue, " + "(select numbervalue "
					+ "from jira.customfieldvalue as B "
					+ "where A.issue = B.issue and B.customfield = 10009) as duration "
					+ "from jira.customfieldvalue as A " + "where A.stringvalue=10000 "
					+ "and A.issue in (SELECT id FROM jira.jiraissue " + "where created <=\"" + end
					+ "\" and created >=\"" + start + "\");";
			// "where created <=\"" + end + "\");";
			ResultSet rs = statement.executeQuery(query);
			int count = 0;
			while (rs.next()) {
				// System.out.println(rs.getInt(1) + " " + rs.getInt(2) + " " +
				// rs.getInt(3));
				count += rs.getInt(3);
			}
			result[0] = Integer.toString(count);

			query = "select A.issue, A.stringvalue, " + "(select numbervalue "
					+ "from jira.customfieldvalue as B "
					+ "where A.issue = B.issue and B.customfield = 10009) as duration "
					+ "from jira.customfieldvalue as A " + "where A.stringvalue=10001 "
					+ "and A.issue in (SELECT id FROM jira.jiraissue " + "where created <=\"" + end
					+ "\" and created >=\"" + start + "\");";
			rs = statement.executeQuery(query);
			count = 0;
			while (rs.next()) {
				count += rs.getInt(3);
			}
			result[1] = Integer.toString(count);

			query = "select A.issue, A.stringvalue, " + "(select numbervalue "
					+ "from jira.customfieldvalue as B "
					+ "where A.issue = B.issue and B.customfield = 10009) as duration "
					+ "from jira.customfieldvalue as A " + "where A.stringvalue=10004 "
					+ "and A.issue in (SELECT id FROM jira.jiraissue " + "where created <=\"" + end
					+ "\" and created >=\"" + start + "\");";
			rs = statement.executeQuery(query);
			count = 0;
			while (rs.next()) {
				count += rs.getInt(3);
			}
			result[2] = Integer.toString(count);

			query = "select A.issue, A.stringvalue, " + "(select numbervalue "
					+ "from jira.customfieldvalue as B "
					+ "where A.issue = B.issue and B.customfield = 10009) as duration "
					+ "from jira.customfieldvalue as A " + "where A.stringvalue=10005 "
					+ "and A.issue in (SELECT id FROM jira.jiraissue " + "where created <=\"" + end
					+ "\" and created >=\"" + start + "\");";
			rs = statement.executeQuery(query);
			count = 0;
			while (rs.next()) {
				count += rs.getInt(3);
			}
			result[3] = Integer.toString(count);

			query = "select A.issue, A.stringvalue, " + "(select numbervalue "
					+ "from jira.customfieldvalue as B "
					+ "where A.issue = B.issue and B.customfield = 10009) as duration "
					+ "from jira.customfieldvalue as A " + "where A.stringvalue=10006 "
					+ "and A.issue in (SELECT id FROM jira.jiraissue " + "where created <=\"" + end
					+ "\" and created >=\"" + start + "\");";
			rs = statement.executeQuery(query);
			count = 0;
			while (rs.next()) {
				count += rs.getInt(3);
			}
			result[4] = Integer.toString(count);

			query = "select A.issue, A.stringvalue, " + "(select numbervalue "
					+ "from jira.customfieldvalue as B "
					+ "where A.issue = B.issue and B.customfield = 10009) as duration "
					+ "from jira.customfieldvalue as A " + "where A.stringvalue=10007 "
					+ "and A.issue in (SELECT id FROM jira.jiraissue " + "where created <=\"" + end
					+ "\" and created >=\"" + start + "\");";
			rs = statement.executeQuery(query);
			count = 0;
			while (rs.next()) {
				count += rs.getInt(3);
			}
			result[5] = Integer.toString(count);

			query = "select A.issue, A.stringvalue, " + "(select numbervalue "
					+ "from jira.customfieldvalue as B "
					+ "where A.issue = B.issue and B.customfield = 10009) as duration "
					+ "from jira.customfieldvalue as A " + "where A.stringvalue IN (10028,100047) "
					+ "and A.issue in (SELECT id FROM jira.jiraissue " + "where created <=\"" + end
					+ "\" and created >=\"" + start + "\");";
			rs = statement.executeQuery(query);
			count = 0;
			while (rs.next()) {
				count += rs.getInt(3);
			}
			result[6] = Integer.toString(count);

			query = "select A.issue, A.stringvalue, " + "(select numbervalue "
					+ "from jira.customfieldvalue as B "
					+ "where A.issue = B.issue and B.customfield = 10009) as duration "
					+ "from jira.customfieldvalue as A " + "where A.stringvalue IN (10029,100053) "
					+ "and A.issue in (SELECT id FROM jira.jiraissue " + "where created <=\"" + end
					+ "\" and created >=\"" + start + "\");";
			rs = statement.executeQuery(query);
			count = 0;
			while (rs.next()) {
				count += rs.getInt(3);
			}
			result[7] = Integer.toString(count);

			query = "select A.issue, A.stringvalue, " + "(select numbervalue "
					+ "from jira.customfieldvalue as B "
					+ "where A.issue = B.issue and B.customfield = 10009) as duration "
					+ "from jira.customfieldvalue as A " + "where A.stringvalue IN (10030,100051) "
					+ "and A.issue in (SELECT id FROM jira.jiraissue " + "where created <=\"" + end
					+ "\" and created >=\"" + start + "\");";
			rs = statement.executeQuery(query);
			count = 0;
			while (rs.next()) {
				count += rs.getInt(3);
			}
			result[8] = Integer.toString(count);
			result[9] = startDate;
			result[10] = endDate;
			rs.close();
			conn.close();

		} catch (ClassNotFoundException e) {
			System.out.println("Sorry,can`t find the Driver!");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * Get Duration Time via three params, stringValue specified the type of catalog:walmart.com, pangaea, dev, qa,
	 * pqa, prod, application, platform, infrastructure
	 * @param startDate
	 * @param endDate
	 * @param stringValue
	 * @return
	 */
	public String getDuration(String startDate, String endDate, String stringValue) {
		Date start = (startDate == null ? Date.valueOf("2012-01-01") : Date.valueOf(startDate));
		Date end = (startDate == null ? Date.valueOf("2999-12-31") : Date.valueOf(endDate));

		String result = "";
		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, user, password);
			if (!conn.isClosed()){
				//System.out.println("Succeeded connecting to the Database!");
			}
			Statement statement = conn.createStatement();
			String query = "SELECT A.issue, A.stringvalue, " + "(SELECT numbervalue "
					+ "FROM jira.customfieldvalue AS B "
					+ "WHERE A.issue = B.issue AND B.customfield IN (10009)) AS duration "
					+ "FROM jira.customfieldvalue AS A " + "WHERE A.stringvalue IN ("
					+ Integer.parseInt(stringValue) + ") " + "AND A.issue IN (SELECT issue FROM jira.customfieldvalue "
					+ "WHERE datevalue <=\"" + end + " 23:59:59\" AND datevalue >=\"" + start + "\");";
			// "where created <=\"" + end + "\");";
			ResultSet rs = statement.executeQuery(query);
			int count = 0;
			while (rs.next()) {
				// System.out.println(rs.getInt(1) + " " + rs.getInt(2) + " " +
				// rs.getInt(3));
				count += rs.getInt(3);
			}
			result = Integer.toString(count);
			rs.close();
			conn.close();

		} catch (ClassNotFoundException e) {
			System.out.println("Sorry,can not find the Driver!");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * 
	 * @param startDate
	 * @param endDate
	 * @param track
	 * @param env
	 * @return
	 */
	public String getTrackEnv(String startDate, String endDate, String track, String env) {
		Date start = (startDate == null ? Date.valueOf("2012-01-01") : Date.valueOf(startDate));
		Date end = (startDate == null ? Date.valueOf("2999-12-31") : Date.valueOf(endDate));

		String result = null;
		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, user, password);
			if (!conn.isClosed()){
				//System.out.println("Succeeded connecting to the Database!");
			}
			Statement statement = conn.createStatement();
			String query = "select A.issue, A.stringvalue, " + "(select B.stringvalue "
					+ "from jira.customfieldvalue as B " + "where A.issue = B.issue and B.stringvalue IN("
					+ Integer.parseInt(env) + ")) as env, " + "(select C.numbervalue "
					+ "from jira.customfieldvalue as C " + "where A.issue = C.issue and C.customfield IN ( "
					+ 10009 + ")) as duration " + "from jira.customfieldvalue as A " + "where A.stringvalue="
					+ Integer.parseInt(track) + " and A.issue in (SELECT issue FROM jira.customfieldvalue "
					+ "where datevalue <=\"" + end + " 23:59:59\" and datevalue >=\"" + start + "\");";
			// "where created <=\"" + end + "\");";
			ResultSet rs = statement.executeQuery(query);
			int count = 0;
			while (rs.next()) {
				// System.out.println(rs.getInt(1) + " " + rs.getInt(2) + " " +
				// rs.getInt(3));
				if (rs.getInt(3) == 0) {
				} else {
					count += rs.getInt(4);
				}
			}
			result = Integer.toString(count);

			rs.close();
			conn.close();

		} catch (ClassNotFoundException e) {
			System.out.println("Sorry,can`t find the Driver!");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
