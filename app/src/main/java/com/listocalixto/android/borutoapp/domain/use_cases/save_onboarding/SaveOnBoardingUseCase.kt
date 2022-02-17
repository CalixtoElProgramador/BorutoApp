package com.listocalixto.android.borutoapp.domain.use_cases.save_onboarding

import com.listocalixto.android.borutoapp.data.repo.Repository

class SaveOnBoardingUseCase(
    private val repository: Repository
) {

    suspend operator fun invoke(completed: Boolean) =
        repository.saveOnBoardingState(completed = completed)


}