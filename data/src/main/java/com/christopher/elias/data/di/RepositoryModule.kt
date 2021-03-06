package com.christopher.elias.data.di

import com.christopher.elias.data.repository.TodoRepositoryImpl
import com.christopher.elias.domain.repository.TodoRepository
import org.koin.dsl.module


/**
 * Created by Christopher Elias on 27/01/2020.
 * christopher.mike.96@gmail.com
 *
 * Peru Apps
 * Lima, Peru.
 **/

val repositoryModule = module {
    single<TodoRepository> { TodoRepositoryImpl(get(), get()) }
}