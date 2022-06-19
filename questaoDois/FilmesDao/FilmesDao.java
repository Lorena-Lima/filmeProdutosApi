package questaoDois.FilmesDao;

import questaoDois.Entidade.Filme;

import java.sql.*;

public class FilmesDao {
    private Connection connection;

    public FilmesDao(Connection connection){
        this.connection= connection;
    }

    public void inserirFilmePaginaUm(Filme filme) throws SQLException {

        String sql = "INSERT INTO filme.pagina1 (nome, descricao, ano) VALUES (?, ?, ?)";
        PreparedStatement stm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        stm.setString(1, filme.getNome());
        stm.setString(2,filme.getDescricao());
        stm.setString(3, filme.getAno());
        stm.execute();

        try(ResultSet rst = stm.getGeneratedKeys()){
            while (rst.next()){
                filme.setId(rst.getInt(1));
            }
        }
    }
    public void inserirFilmePaginaDois(Filme filme) throws SQLException {

        String sql = "INSERT INTO filme.pagina2 (nome, descricao, ano) VALUES (?, ?, ?)";
        PreparedStatement stm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        stm.setString(1, filme.getNome());
        stm.setString(2,filme.getDescricao());
        stm.setString(3, filme.getAno());
        stm.execute();

        try(ResultSet rst = stm.getGeneratedKeys()){
            while (rst.next()){
                filme.setId(rst.getInt(1));
            }
        }
    }
}
