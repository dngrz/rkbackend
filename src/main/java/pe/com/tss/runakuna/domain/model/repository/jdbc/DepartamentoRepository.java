package pe.com.tss.runakuna.domain.model.repository.jdbc;

import java.util.List;

import pe.com.tss.runakuna.view.model.DepartamentoViewModel;

public interface DepartamentoRepository {

	List<DepartamentoViewModel> findDepartamentos();
}
