package br.com.lucas.apprepositories.domain.di

import br.com.lucas.apprepositories.domain.ListUserRepositoriesUseCase
import org.koin.core.context.loadKoinModules
import org.koin.core.module.Module
import org.koin.dsl.module

object DomainModule {

    fun load(){
        loadKoinModules(useCaseModule())
    }

    private fun useCaseModule(): Module{
        return module {
            factory {
                ListUserRepositoriesUseCase(get())
            }
        }
    }
}