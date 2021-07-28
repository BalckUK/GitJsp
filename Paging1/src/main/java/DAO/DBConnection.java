package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import DTO.PaingDTO;

public class DBConnection {

	public Connection getConnection() throws Exception {
		Context ctx = new InitialContext();
		DataSource ds = (DataSource) ctx.lookup("java:comp/env/dbcp"); // java:comp/env/dbcp
		return ds.getConnection();
	}

	public List<PaingDTO> allList() throws Exception {
		String sql = "select * from paging";
		List<PaingDTO> list = new ArrayList<>();
		try (Connection con = getConnection(); PreparedStatement patmt = con.prepareStatement(sql)) {
			try (ResultSet re = patmt.executeQuery();) {
				list.add(new PaingDTO(re.getInt("num"), re.getString("writer"), re.getString("title"),
						re.getString("content")));
			}
		}
		return list;
	}

}
