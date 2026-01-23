package repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entities.Employe;

public class EmployeRepository {
	
	//CRUD: create - read - update - delete
	
	public void insert(Employe e) throws Exception{
		Connection cnx = ConnexionDatabase.getConnexion();
		String sql = "insert into employes(nom,prenom,salaire) values (?,?,?)";
		PreparedStatement ps = cnx.prepareStatement(sql);
		ps.setString(1, e.getNom());
		ps.setString(2, e.getPrenom());
		ps.setDouble(3, e.getSalaire());
		
		ps.executeUpdate();
		cnx.close();
	}
	
	public void update(Employe e) throws Exception{
		Connection cnx = ConnexionDatabase.getConnexion();
		String sql = "update employes set nom=?, prenom=?, salaire=? where id=?";
		PreparedStatement ps = cnx.prepareStatement(sql);
		ps.setString(1, e.getNom());
		ps.setString(2, e.getPrenom());
		ps.setDouble(3, e.getSalaire());
		ps.setInt(4, e.getId());
		
		ps.executeUpdate();
		cnx.close();
	}
	
	public void delete(int id) throws Exception{
		Connection cnx = ConnexionDatabase.getConnexion();
		String sql = "delete from employes where id=?";
		PreparedStatement ps = cnx.prepareStatement(sql);
		ps.setInt(1, id);
		
		ps.executeUpdate();
		cnx.close();
	}
	
	public List<Employe> getAll() throws Exception{
		
		List<Employe> lst = new ArrayList<Employe>();
		
		Connection cnx = ConnexionDatabase.getConnexion();
		String sql = "select * from employes";
		PreparedStatement ps = cnx.prepareStatement(sql);
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			Employe e = new Employe(rs.getInt("id"), rs.getString("nom"), rs.getString("prenom"), rs.getDouble("salaire"));
			lst.add(e);
		}
		
		rs.close();
		cnx.close();
		
		
		return lst;
	}
	
	public Employe getById(int id) throws Exception{
		
		Employe e = null;
		
		Connection cnx = ConnexionDatabase.getConnexion();
		String sql = "select * from employes where id=?";
		PreparedStatement ps = cnx.prepareStatement(sql);
		ps.setInt(1, id);
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			e = new Employe(rs.getInt("id"), rs.getString("nom"), rs.getString("prenom"), rs.getDouble("salaire"));
			
		}
		
		rs.close();
		cnx.close();
		
		
		return e;
	}

}
