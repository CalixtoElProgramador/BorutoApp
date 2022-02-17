package com.listocalixto.android.borutoapp.domain.use_cases.read_onboarding

import com.listocalixto.android.borutoapp.data.repo.Repository
import kotlinx.coroutines.flow.Flow

class ReadOnBoardingUseCase(
    private val repository: Repository
) {

    operator fun invoke(): Flow<Boolean> = repository.readOnBoardingState()

}