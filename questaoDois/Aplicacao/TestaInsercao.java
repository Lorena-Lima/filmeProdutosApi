package questaoDois.Aplicacao;

import questaoDois.Entidade.Filme;
import questaoDois.FilmesDao.FilmesDao;
import questaoUm.ConexaoFactory.ConexaoFactory;
import java.sql.Connection;
import java.sql.SQLException;

public class TestaInsercao {
    public static void main(String[] args) throws SQLException {
        Filme interestelar = new Filme("Interestelar",
                "Um grupo de astronaltas embarca em uma missão em outra constelação para verificar outros planetas viáveis para a vida humana"
                , "2014");
        Filme coringa = new Filme("Joker"
                ,"Arthur Fleck, até então comediante, vai se tornando um criminoso ao ser isolado e intimidado pela sociedade de Gothan"
                , "2019");
        Filme batman = new Filme("The Batman"
                ,"Bruce Wayne, o vigilante solitário está há dois anos como Batman espreitando as ruas de Gothan City, sendo a personificação da vingança pra população. "
                ,"2022");
        Filme starWarsTres = new Filme("Star Wars episódio III: A vingança dos Sith"
                ,"No momento derradeiro do impasse das guerras clônicas Anakin Skywalker sofre influência de suas emoções que o desviam, o tornando o terrível Dath Vader enquanto mantem laços com Padmé Amidala."
                ,"2005");
        Filme  starTrek= new Filme("Star Trek"
                ,"A bordo da USS Enterprise uma tripulação de novatos embarca em uma viagem que é atrapalhada por Nero, um comandante cuja vingança ameaça a toda humanidade. "
                ,"2009");
        Filme  duna = new Filme("Duna"
                ," O jovem Paul Atraides viaja pra um planeta perigoso para garantir o futuro de seu povo."
                ,"2021");
        Filme  aChegada= new Filme("A chegada"
                ,"Naves alienígenas chegaram na Terra. Uma linguista e um militar são chamados para decifrar as mensagens dos visitantes a fim de se comunicar."
                ,"2016");
        Filme jojoRabbit = new Filme("Jojo Rabbit"
                ,"Jojo é um garoto alemão solitário, nacionalista, que descobre que sua mãe esconde uma garota judia no sótão."
                ,"2020");
        Filme topGun = new Filme(" Top Gun : Maverick"
                 ,"Pete “Maverick” Mitchell, um aviador da marinha, retorna à Top Gun, sua escola de formação, a fim de ajudar em uma nova missão."
                 ,"2022");
        Filme guardioesGalaxia = new Filme("Guardiões da Galáxia"
                ,"Peter Qwill é um aventureiro galáctico que torna-se presa de caçadores de recompensa após roubar um artefato valioso. Para escapar do perigo faz um aliança com um grupo de 4 extraterrestes"
                ,"2014");
        Filme  moulinRouge = new Filme("Moulin Rouge – Amor em vermelho"
                ,"O idealista e inocente poeta Christian se apaixona por Satin, a estrela de uma boate parisiense."
                ,"2001");
        Filme  doutorEstranho= new Filme("Doutor Estranho"
                ,"Stephen Strange, um renomado neurocirurgião, busca ajuda em Kamar-Taj após sofre um grave acidente automobilístico que o incapacitou."
                ,"2016");
        Filme  homemAranha= new Filme("Homen-Aranha"
                ,"Peter Parker após ser picado por uma aranha modificada geneticamente ganha superpoderes e os usa contra o mal."
                ,"2002");
        Filme  esquadraoSuicida = new Filme("O esquadrão Suicida"
                ,"Supervilões são enviados a uma ilha pelo governo americano a fim de impedir o uso de armas de alta tecnologia pelo governo local."
                ,"2021");
        Filme  harryPotterPedra= new Filme("Harry Potter e a Pedra Filosofal"
                ,"Harry Potter, um órfão, começa a estudar em uma escola para bruxos, onde descobre segredos de seu passado enquanto vive aventuras com seus mais novos amigos bruxos."
                ,"2001");
        Filme harryPotterCalice = new Filme("Harry Potter e o Cálice de Fogo",
                "Mais uma vez em Hogwarts, Harry compete em um torneio entre as melhores escolas de bruxos, mesmo não tendo se inscrito."
                ,"2005");
        Filme  euRobo= new Filme("Eu, Robô"
                ,"Em uma sociedade futurística onde robôs são usados para auxiliar aos humanos um robô é suspeito de matar um humano, o que fere diretamente as Lei do Robóticos."
                ,"2004");
        Filme milNovecentosEDezessete = new Filme("1917"
                ,"Dois soldados britânicos precisam de entregar uma mensagem através do território inimigo para salvar 1600 companheiros de uma emboscada. "
                ,"2009");
        Filme rogueOne = new Filme("Rogue One: Uma História Star Wars"
                , "Jyn Erso é recrutada pela Aliança Rebelde para roubar os planos para acabar com a arma mais poderosa do império: a estrela da morte."
                , "2016");
        Filme  asBranquelas= new Filme("As Branquelas"
                ,"Dois irmãos agentes da FBI, são enviados para escoltar duas irmãs socialites. Após elas se recusarem a ir devido a um acidente que causou arranhões em seus rostos eles decidem se passar por elas."
                ,"2004");
        Connection conn = ConexaoFactory.getConexao();

        new FilmesDao(conn).inserirFilmePaginaUm(interestelar);
        new FilmesDao(conn).inserirFilmePaginaUm(coringa);
        new FilmesDao(conn).inserirFilmePaginaUm(batman);
        new FilmesDao(conn).inserirFilmePaginaUm(starWarsTres);
        new FilmesDao(conn).inserirFilmePaginaUm(starTrek);
        new FilmesDao(conn).inserirFilmePaginaUm(duna);
        new FilmesDao(conn).inserirFilmePaginaUm(aChegada);
        new FilmesDao(conn).inserirFilmePaginaUm(jojoRabbit);
        new FilmesDao(conn).inserirFilmePaginaUm(topGun);
        new FilmesDao(conn).inserirFilmePaginaUm(guardioesGalaxia);

        new FilmesDao(conn).inserirFilmePaginaDois(moulinRouge);
        new FilmesDao(conn).inserirFilmePaginaDois(doutorEstranho);
        new FilmesDao(conn).inserirFilmePaginaDois(homemAranha);
        new FilmesDao(conn).inserirFilmePaginaDois(esquadraoSuicida);
        new FilmesDao(conn).inserirFilmePaginaDois(harryPotterPedra);
        new FilmesDao(conn).inserirFilmePaginaDois(harryPotterCalice);
        new FilmesDao(conn).inserirFilmePaginaDois(euRobo);
        new FilmesDao(conn).inserirFilmePaginaDois(milNovecentosEDezessete);
        new FilmesDao(conn).inserirFilmePaginaDois(rogueOne);
        new FilmesDao(conn).inserirFilmePaginaDois(asBranquelas);

        ConexaoFactory.fechaConexao(conn);
    }
}
