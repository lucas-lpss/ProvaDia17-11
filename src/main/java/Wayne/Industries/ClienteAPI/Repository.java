package Wayne.Industries.ClienteAPI;

import org.springframework.data.jpa.repository.JpaRepository;
import Wayne.Industries.ClienteAPI.Cliente;

public interface Repository extends JpaRepository<Cliente,Long> {

}