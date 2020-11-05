package br.com.itau.itaumon.dao;
import org.springframework.data.repository.CrudRepository;
import br.com.itau.itaumon.beans.Evento;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.Date;
import java.util.List;

public interface EventoDAO extends CrudRepository <Evento, Integer>{
  List<Evento> findByDataBetween(Date inicio, Date fim);

  @Query(value="SELECT count(numseq) as total FROM itmn_evento where"
			+ " data >= :inicio and data<= :fim AND alarme_id = :num", nativeQuery = true)
	long getByTotal(@Param("inicio") Date inicio, @Param("fim") Date fim, @Param("num") int num);
}