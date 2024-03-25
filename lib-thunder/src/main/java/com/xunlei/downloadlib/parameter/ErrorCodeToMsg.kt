package com.xunlei.downloadlib.parameter

object ErrorCodeToMsg {
    const val ERR_CODE_TO_MSG = "{\n" +
            "    \"9000\": \"XL_NO_ERRNO\",\n" +
            "    \"9101\": \"XL_ALREADY_INIT\",\n" +
            "    \"9102\": \"XL_SDK_NOT_INIT\",\n" +
            "    \"9103\": \"XL_TASK_ALREADY_EXIST\",\n" +
            "    \"9104\": \"XL_TASK_NOT_EXIST\",\n" +
            "    \"9105\": \"XL_TASK_ALREADY_STOPPED\",\n" +
            "    \"9106\": \"XL_TASK_ALREADY_RUNNING\",\n" +
            "    \"9107\": \"XL_TASK_NOT_START\",\n" +
            "    \"9108\": \"XL_TASK_STILL_RUNNING\",\n" +
            "    \"9109\": \"XL_FILE_EXISTED\",\n" +
            "    \"9110\": \"XL_DISK_FULL\",\n" +
            "    \"9111\": \"XL_TOO_MUCH_TASK\",\n" +
            "    \"9112\": \"XL_PARAM_ERROR\",\n" +
            "    \"9113\": \"XL_SCHEMA_NOT_SUPPORT\",\n" +
            "    \"9114\": \"XL_DYNAMIC_PARAM_FAIL\",\n" +
            "    \"9115\": \"XL_CONTINUE_NO_NAME\",\n" +
            "    \"9116\": \"XL_APPNAME_APPKEY_ERROR\",\n" +
            "    \"9117\": \"XL_CREATE_THREAD_ERROR\",\n" +
            "    \"9118\": \"XL_TASK_FINISH\",\n" +
            "    \"9119\": \"XL_TASK_NOT_RUNNING\",\n" +
            "    \"9120\": \"XL_TASK_NOT_IDLE\",\n" +
            "    \"9121\": \"XL_TASK_TYPE_NOT_SUPPORT\",\n" +
            "    \"9122\": \"XL_ADD_RESOURCE_ERROR\",\n" +
            "    \"9123\": \"XL_TASK_LOADING_CFG\",\n" +
            "    \"9301\": \"XL_NO_ENOUGH_BUFFER\",\n" +
            "    \"9302\": \"XL_TORRENT_PARSE_ERROR\",\n" +
            "    \"9303\": \"XL_INDEX_NOT_READY\",\n" +
            "    \"9304\": \"XL_TORRENT_IMCOMPLETE\",\n" +
            "    \"9900\": \"DOWNLOAD_MANAGER_ERROR\",\n" +
            "    \"9901\": \"APPKEY_CHECKER_ERROR\",\n" +
            "    \"111024\": \"COMMON_ERRCODE_BASE\",\n" +
            "    \"111025\": \"TARGET_THREAD_STOPING\",\n" +
            "    \"111026\": \"OUT_OF_MEMORY\",\n" +
            "    \"111031\": \"TASK_USE_TOO_MUCH_MEM\",\n" +
            "    \"111032\": \"OUT_OF_FIXED_MEMORY\",\n" +
            "    \"111033\": \"QUEUE_NO_ROOM\",\n" +
            "    \"111035\": \"MAP_UNINIT\",\n" +
            "    \"111036\": \"MAP_DUPLICATE_KEY\",\n" +
            "    \"111037\": \"MAP_KEY_NOT_FOUND\",\n" +
            "    \"111038\": \"INVALID_ITERATOR\",\n" +
            "    \"111039\": \"BUFFER_OVERFLOW\",\n" +
            "    \"111041\": \"INVALID_ARGUMENT\",\n" +
            "    \"111048\": \"INVALID_SOCKET_DESCRIPTOR\",\n" +
            "    \"111050\": \"ERROR_INVALID_INADDR\",\n" +
            "    \"111181\": \"CORRECT_BYTES_TOO_MUCH\",\n" +
            "    \"111057\": \"NOT_IMPLEMENT\",\n" +
            "    \"111074\": \"INVALID_TIMER_INDEX\",\n" +
            "    \"111078\": \"DNS_INVALID_ADDR\",\n" +
            "    \"111083\": \"BAD_DIR_PATH\",\n" +
            "    \"111084\": \"FILE_CANNOT_TRUNCATE\",\n" +
            "    \"111085\": \"INSUFFICIENT_DISK_SPACE\",\n" +
            "    \"111086\": \"FILE_TOO_BIG\",\n" +
            "    \"111118\": \"DISPATCHER_ERRCODE_BASE\",\n" +
            "    \"111119\": \"DATA_MGR_ERRCODE_BASE\",\n" +
            "    \"111120\": \"ALLOC_INVALID_SIZE\",\n" +
            "    \"111121\": \"DATA_BUFFER_IS_FULL\",\n" +
            "    \"111122\": \"BLOCK_NO_INVALID\",\n" +
            "    \"111123\": \"CHECK_DATA_BUFFER_NOT_ENOUG\",\n" +
            "    \"111124\": \"BCID_CHECK_FAIL\",\n" +
            "    \"111125\": \"BCID_ONCE_CHECT_TOO_MUCH\",\n" +
            "    \"111126\": \"READ_FILE_ERR\",\n" +
            "    \"111127\": \"WRITE_FILE_ERR\",\n" +
            "    \"111128\": \"OPEN_FILE_ERR\",\n" +
            "    \"111129\": \"FILE_PATH_TOO_LONG\",\n" +
            "    \"111130\": \"SD_INVALID_FILE_SIZE\",\n" +
            "    \"111131\": \"FILE_CFG_MAGIC_ERROR\",\n" +
            "    \"111132\": \"FILE_CFG_READ_ERROR\",\n" +
            "    \"111133\": \"FILE_CFG_WRITE_ERROR\",\n" +
            "    \"111134\": \"FILE_CFG_READ_HEADER_ERROR\",\n" +
            "    \"111135\": \"FILE_CFG_RESOLVE_ERROR\",\n" +
            "    \"111136\": \"TASK_FAILURE_NO_DATA_PIPE\",\n" +
            "    \"111137\": \"NO_FILE_NAME\",\n" +
            "    \"111138\": \"CANNOT_GET_FILE_NAME\",\n" +
            "    \"111139\": \"CREATE_FILE_FAIL\",\n" +
            "    \"111140\": \"OPEN_OLD_FILE_FAIL\",\n" +
            "    \"111141\": \"FILE_SIZE_NOT_BELIEVE\",\n" +
            "    \"111142\": \"FILE_SIZE_TOO_SMALL\",\n" +
            "    \"111143\": \"FILE_NOT_EXIST\",\n" +
            "    \"111144\": \"FILE_INVALID_PARA\",\n" +
            "    \"111145\": \"FILE_CREATING\",\n" +
            "    \"111146\": \"FIL_INFO_INVALID_DATA\",\n" +
            "    \"111147\": \"FIL_INFO_RECVED_DATA\",\n" +
            "    \"111159\": \"CONF_MGR_ERRCODE_BASE\",\n" +
            "    \"111160\": \"SETTINGS_ERR_UNKNOWN\",\n" +
            "    \"111161\": \"SETTINGS_ERR_INVALID_FILE_NAME\",\n" +
            "    \"111162\": \"SETTINGS_ERR_CFG_FILE_NOT_EXIST\",\n" +
            "    \"111163\": \"SETTINGS_ERR_INVALID_LINE\",\n" +
            "    \"111164\": \"SETTINGS_ERR_INVALID_ITEM_NAME\",\n" +
            "    \"111165\": \"SETTINGS_ERR_INVALID_ITEM_VALUE\",\n" +
            "    \"111166\": \"SETTINGS_ERR_LIST_EMPTY\",\n" +
            "    \"111167\": \"SETTINGS_ERR_ITEM_NOT_FOUND\",\n" +
            "    \"111168\": \"NET_REACTOR_ERRCODE_BASE\",\n" +
            "    \"111169\": \"NET_CONNECT_SSL_ERR\",\n" +
            "    \"111170\": \"NET_BROKEN_PIPE\",\n" +
            "    \"111171\": \"NET_CONNECTION_REFUSED\",\n" +
            "    \"111172\": \"NET_SSL_GET_FD_ERROR\",\n" +
            "    \"111173\": \"NET_OP_CANCEL\",\n" +
            "    \"111174\": \"NET_UNKNOWN_ERROR\",\n" +
            "    \"111175\": \"NET_NORMAL_CLOSE\",\n" +
            "    \"111176\": \"TASK_FAIL_LONG_TIME_NO_RECV_DATA\",\n" +
            "    \"111177\": \"TASK_FILE_SIZE_TOO_LARGE\",\n" +
            "    \"111178\": \"TASK_RETRY_ALWAY_FAIL\",\n" +
            "    \"111300\": \"ASYN_FILE_E_BASE\",\n" +
            "    \"111301\": \"ASYN_FILE_E_OP_NONE\",\n" +
            "    \"111302\": \"ASYN_FILE_E_OP_BUSY\",\n" +
            "    \"111303\": \"ASYN_FILE_E_FILE_NOT_OPEN\",\n" +
            "    \"111304\": \"ASYN_FILE_E_FILE_REOPEN\",\n" +
            "    \"111305\": \"ASYN_FILE_E_EMPTY_FILE\",\n" +
            "    \"111306\": \"ASYN_FILE_E_FILE_SIZE_LESS\",\n" +
            "    \"111307\": \"ASYN_FILE_E_TOO_MUCH_DATA\",\n" +
            "    \"111308\": \"ASYN_FILE_E_FILE_CLOSING\",\n" +
            "    \"112400\": \"ERR_PTL_PROTOCOL_NOT_SUPPORT\",\n" +
            "    \"112500\": \"ERR_PTL_PEER_OFFLINE\",\n" +
            "    \"112600\": \"ERR_PTL_GET_PEERSN_FAILED\",\n" +
            "    \"11300\": \"P2P_PIPE_ERRCODE_BASE\",\n" +
            "    \"11301\": \"ERR_P2P_VERSION_NOT_SUPPORT\",\n" +
            "    \"11302\": \"ERR_P2P_WAITING_CLOSE\",\n" +
            "    \"11303\": \"ERR_P2P_HANDSHAKE_RESP_FAIL\",\n" +
            "    \"11304\": \"ERR_P2P_REQUEST_RESP_FAIL\",\n" +
            "    \"11305\": \"ERR_P2P_UPLOAD_OVER_MAX\",\n" +
            "    \"11306\": \"ERR_P2P_REMOTE_UNKNOWN_MY_CMD\",\n" +
            "    \"11307\": \"ERR_P2P_NOT_SUPPORT_UDT\",\n" +
            "    \"11308\": \"ERR_P2P_BROKER_CONNECT\",\n" +
            "    \"11309\": \"ERR_P2P_INVALID_COMMAND\",\n" +
            "    \"11310\": \"ERR_P2P_INVALID_PARAM\",\n" +
            "    \"11311\": \"ERR_P2P_CONNECT_FAILED\",\n" +
            "    \"11312\": \"ERR_P2P_CONNECT_UPLOAD_SLOW\",\n" +
            "    \"11313\": \"ERR_P2P_ALLOC_MEM_ERR\",\n" +
            "    \"11314\": \"ERR_P2P_SEND_HANDSHAKE\",\n" +
            "    \"114001\": \"TASK_FAILURE_QUERY_EMULE_HUB_FAILED\",\n" +
            "    \"114101\": \"TASK_FAILURE_EMULE_NO_RECORD\",\n" +
            "    \"114002\": \"TASK_FAILURE_SUBTASK_FAILED\",\n" +
            "    \"114003\": \"TASK_FAILURE_CANNOT_START_SUBTASK\",\n" +
            "    \"114004\": \"TASK_FAILURE_QUERY_BT_HUB_FAILED\",\n" +
            "    \"114005\": \"TASK_FAILURE_PARSE_TORRENT_FAILED\",\n" +
            "    \"114006\": \"TASK_FAILURE_GET_TORRENT_FAILED\",\n" +
            "    \"114007\": \"TASK_FAILURE_SAVE_TORRENT_FAILED\",\n" +
            "    \"115000\": \"RES_QUERY_E_BASE\",\n" +
            "    \"115100\": \"HTTP_HUB_CLIENT_E_BASE\",\n" +
            "    \"116000\": \"IP6_ERRCODE_BASE\",\n" +
            "    \"116001\": \"ERR_INVALID_ADDRESS_FAMILY\",\n" +
            "    \"116002\": \"IP6_INVALID_IN6ADDR\",\n" +
            "    \"116003\": \"IP6_NOT_SUPPORT_SSL\",\n" +
            "    \"117000\": \"PAUSE_TASK_WRITE_CFG_ERR\",\n" +
            "    \"117001\": \"PAUSE_TASK_WRITE_DATA_TIMEOUT\"\n" +
            "}"
}
