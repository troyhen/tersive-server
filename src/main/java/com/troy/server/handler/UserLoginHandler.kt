package com.troy.server.handler

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler
import com.troy.server.dto.LoginDTO

class UserLoginHandler : RequestHandler<LoginDTO, UserResult> {

    override fun handleRequest(input: LoginDTO, context: Context): UserResult {
        return UserResult.SUCCESS
    }
}
