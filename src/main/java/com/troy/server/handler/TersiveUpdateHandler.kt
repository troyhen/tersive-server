package com.troy.server.handler

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler
import com.troy.server.dto.TersiveDTO
import java.util.*

class TersiveUpdateHandler : RequestHandler<TersiveDTO, String> {

    override fun handleRequest(input: TersiveDTO, context: Context): String {
        return ""
    }
}
