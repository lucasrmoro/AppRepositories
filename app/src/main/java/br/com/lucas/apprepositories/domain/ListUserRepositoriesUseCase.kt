package br.com.lucas.apprepositories.domain

import br.com.lucas.apprepositories.core.UseCase
import br.com.lucas.apprepositories.data.model.Repo
import br.com.lucas.apprepositories.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
) : UseCase<String, List<Repo>>() {
    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}