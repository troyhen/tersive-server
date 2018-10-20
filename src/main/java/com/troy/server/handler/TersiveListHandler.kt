package com.troy.server.handler

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler
import com.troy.server.dto.TersiveDTO
import java.util.*

class TersiveListHandler : RequestHandler<String, List<TersiveDTO>> {

    override fun handleRequest(input: String, context: Context): List<TersiveDTO> {
        return emptyList()
    }
}
