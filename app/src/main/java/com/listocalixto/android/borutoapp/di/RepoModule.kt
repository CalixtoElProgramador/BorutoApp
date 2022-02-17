package com.listocalixto.android.borutoapp.di

import android.content.Context
import com.listocalixto.android.borutoapp.data.repo.DataStoreOperationsImpl
import com.listocalixto.android.borutoapp.data.repo.Repository
import com.listocalixto.android.borutoapp.domain.repo.DataStoreOperations
import com.listocalixto.android.borutoapp.domain.use_cases.UseCases
import com.listocalixto.android.borutoapp.domain.use_cases.read_onboarding.ReadOnBoardingUseCase
import com.listocalixto.android.borutoapp.domain.use_cases.save_onboarding.SaveOnBoardingUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepoModule {

    @Provides
    @Singleton
    fun provideDataStoreOperations(@ApplicationContext context: Context): DataStoreOperations {
        return DataStoreOperationsImpl(context = context)
    }

    @Provides
    @Singleton
    fun provideUseCases(repository: Repository): UseCases =
        UseCases(
            saveOnBoardingUseCase = SaveOnBoardingUseCase(repository),
            readOnBoardingUseCase = ReadOnBoardingUseCase(repository)
        )

}