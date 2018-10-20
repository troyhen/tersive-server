package com.troy.server.handler

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler
import java.util.*

class UserDeleteHandler : RequestHandler<UUID, UserResult> {

    override fun handleRequest(input: UUID, context: Context): UserResult {
        return UserResult.SUCCESS
    }
}
