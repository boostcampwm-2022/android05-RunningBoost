package com.whyranoid.data.running

import com.whyranoid.data.di.running.RunningDataSource
import com.whyranoid.domain.repository.RunningRepository
import kotlinx.coroutines.flow.Flow

class RunningRepositoryImpl(private val runningDataSource: RunningDataSource) : RunningRepository {
    override fun getCurrentRunnerCount(): Flow<Int> {
        return runningDataSource.getCurrentRunnerCount()
    }

    override suspend fun startRunning(uid: String): Boolean {
        return true
    }

    override suspend fun finishRunning(uid: String): Boolean {
        return true
    }
}