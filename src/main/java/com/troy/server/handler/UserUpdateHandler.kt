package com.troy.server.handler

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler
import com.troy.server.dto.UserDTO

class UserUpdateHandler : RequestHandler<UserDTO, UserResult> {

    override fun handleRequest(input: UserDTO, context: Context): UserResult {
        return UserResult.SUCCESS
    }
}
