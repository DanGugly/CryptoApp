package com.example.cryptoapp.model


import com.google.gson.annotations.SerializedName

data class Cryptos(
    @SerializedName("AAVEBTC")
    val aAVEBTC: AAVEBTC,
    @SerializedName("AAVEETH")
    val aAVEETH: AAVEETH,
    @SerializedName("AAVEUSDT")
    val aAVEUSDT: AAVEUSDT,
    @SerializedName("ADABTC")
    val aDABTC: ADABTC,
    @SerializedName("ADAETH")
    val aDAETH: ADAETH,
    @SerializedName("ADAUSDT")
    val aDAUSDT: ADAUSDT,
    @SerializedName("ALGOBTC")
    val aLGOBTC: ALGOBTC,
    @SerializedName("ALGOETH")
    val aLGOETH: ALGOETH,
    @SerializedName("ALGOUSDT")
    val aLGOUSDT: ALGOUSDT,
    @SerializedName("ATOMBTC")
    val aTOMBTC: ATOMBTC,
    @SerializedName("ATOMETH")
    val aTOMETH: ATOMETH,
    @SerializedName("ATOMUSDT")
    val aTOMUSDT: ATOMUSDT,
    @SerializedName("BCHBTC")
    val bCHBTC: BCHBTC,
    @SerializedName("BCHETH")
    val bCHETH: BCHETH,
    @SerializedName("BCHEURS")
    val bCHEURS: BCHEURS,
    @SerializedName("BCHUSDT")
    val bCHUSDT: BCHUSDT,
    @SerializedName("BNBBTC")
    val bNBBTC: BNBBTC,
    @SerializedName("BNBETH")
    val bNBETH: BNBETH,
    @SerializedName("BNBUSDT")
    val bNBUSDT: BNBUSDT,
    @SerializedName("BSVBTC")
    val bSVBTC: BSVBTC,
    @SerializedName("BSVUSDT")
    val bSVUSDT: BSVUSDT,
    @SerializedName("BTCARS")
    val bTCARS: BTCARS,
    @SerializedName("BTCBRL")
    val bTCBRL: BTCBRL,
    @SerializedName("BTCBUSD")
    val bTCBUSD: BTCBUSD,
    @SerializedName("BTCCLP")
    val bTCCLP: BTCCLP,
    @SerializedName("BTCDAI")
    val bTCDAI: BTCDAI,
    @SerializedName("BTCEURS")
    val bTCEURS: BTCEURS,
    @SerializedName("BTCTUSD")
    val bTCTUSD: BTCTUSD,
    @SerializedName("BTCUSDC")
    val bTCUSDC: BTCUSDC,
    @SerializedName("BTCUSDP")
    val bTCUSDP: BTCUSDP,
    @SerializedName("BTCUSDT")
    val bTCUSDT: BTCUSDT,
    @SerializedName("BTTOLDBTC")
    val bTTOLDBTC: BTTOLDBTC,
    @SerializedName("BTTOLDETH")
    val bTTOLDETH: BTTOLDETH,
    @SerializedName("BTTOLDUSDT")
    val bTTOLDUSDT: BTTOLDUSDT,
    @SerializedName("CELBTC")
    val cELBTC: CELBTC,
    @SerializedName("CELETH")
    val cELETH: CELETH,
    @SerializedName("COMPBTC")
    val cOMPBTC: COMPBTC,
    @SerializedName("COMPETH")
    val cOMPETH: COMPETH,
    @SerializedName("COMPUSDT")
    val cOMPUSDT: COMPUSDT,
    @SerializedName("CROBTC")
    val cROBTC: CROBTC,
    @SerializedName("CROETH")
    val cROETH: CROETH,
    @SerializedName("CROUSDT")
    val cROUSDT: CROUSDT,
    @SerializedName("DAIUSDC")
    val dAIUSDC: DAIUSDC,
    @SerializedName("DASHBTC")
    val dASHBTC: DASHBTC,
    @SerializedName("DASHETH")
    val dASHETH: DASHETH,
    @SerializedName("DASHEURS")
    val dASHEURS: DASHEURS,
    @SerializedName("DASHUSDT")
    val dASHUSDT: DASHUSDT,
    @SerializedName("DOTBTC")
    val dOTBTC: DOTBTC,
    @SerializedName("DOTETH")
    val dOTETH: DOTETH,
    @SerializedName("DOTUSDT")
    val dOTUSDT: DOTUSDT,
    @SerializedName("ENJBTC")
    val eNJBTC: ENJBTC,
    @SerializedName("ENJETH")
    val eNJETH: ENJETH,
    @SerializedName("ENJUSDT")
    val eNJUSDT: ENJUSDT,
    @SerializedName("EOSBTC")
    val eOSBTC: EOSBTC,
    @SerializedName("EOSETH")
    val eOSETH: EOSETH,
    @SerializedName("EOSEURS")
    val eOSEURS: EOSEURS,
    @SerializedName("EOSUSDT")
    val eOSUSDT: EOSUSDT,
    @SerializedName("ETHARS")
    val eTHARS: ETHARS,
    @SerializedName("ETHBRL")
    val eTHBRL: ETHBRL,
    @SerializedName("ETHBTC")
    val eTHBTC: ETHBTC,
    @SerializedName("ETHCLP")
    val eTHCLP: ETHCLP,
    @SerializedName("ETHDAI")
    val eTHDAI: ETHDAI,
    @SerializedName("ETHEURS")
    val eTHEURS: ETHEURS,
    @SerializedName("ETHTUSD")
    val eTHTUSD: ETHTUSD,
    @SerializedName("ETHUSDC")
    val eTHUSDC: ETHUSDC,
    @SerializedName("ETHUSDP")
    val eTHUSDP: ETHUSDP,
    @SerializedName("ETHUSDT")
    val eTHUSDT: ETHUSDT,
    @SerializedName("EURSDAI")
    val eURSDAI: EURSDAI,
    @SerializedName("EURSTUSD")
    val eURSTUSD: EURSTUSD,
    @SerializedName("EURSUSDT")
    val eURSUSDT: EURSUSDT,
    @SerializedName("FILBTC")
    val fILBTC: FILBTC,
    @SerializedName("FILUSDT")
    val fILUSDT: FILUSDT,
    @SerializedName("HTBTC")
    val hTBTC: HTBTC,
    @SerializedName("HTUSDT")
    val hTUSDT: HTUSDT,
    @SerializedName("LINKBTC")
    val lINKBTC: LINKBTC,
    @SerializedName("LINKETH")
    val lINKETH: LINKETH,
    @SerializedName("LINKUSDT")
    val lINKUSDT: LINKUSDT,
    @SerializedName("LTCBTC")
    val lTCBTC: LTCBTC,
    @SerializedName("LTCETH")
    val lTCETH: LTCETH,
    @SerializedName("LTCEURS")
    val lTCEURS: LTCEURS,
    @SerializedName("LTCUSDT")
    val lTCUSDT: LTCUSDT,
    @SerializedName("LUNABTC")
    val lUNABTC: LUNABTC,
    @SerializedName("LUNAUSDT")
    val lUNAUSDT: LUNAUSDT,
    @SerializedName("MATICBTC")
    val mATICBTC: MATICBTC,
    @SerializedName("MKRBTC")
    val mKRBTC: MKRBTC,
    @SerializedName("MKRDAI")
    val mKRDAI: MKRDAI,
    @SerializedName("MKRETH")
    val mKRETH: MKRETH,
    @SerializedName("MKRUSDT")
    val mKRUSDT: MKRUSDT,
    @SerializedName("NEOBTC")
    val nEOBTC: NEOBTC,
    @SerializedName("NEOETH")
    val nEOETH: NEOETH,
    @SerializedName("NEOEURS")
    val nEOEURS: NEOEURS,
    @SerializedName("NEOUSDT")
    val nEOUSDT: NEOUSDT,
    @SerializedName("NEXOBTC")
    val nEXOBTC: NEXOBTC,
    @SerializedName("NEXOETH")
    val nEXOETH: NEXOETH,
    @SerializedName("NEXOUSDT")
    val nEXOUSDT: NEXOUSDT,
    @SerializedName("OMGBTC")
    val oMGBTC: OMGBTC,
    @SerializedName("OMGETH")
    val oMGETH: OMGETH,
    @SerializedName("OMGUSDT")
    val oMGUSDT: OMGUSDT,
    @SerializedName("ONEBTC")
    val oNEBTC: ONEBTC,
    @SerializedName("ONEUSDT")
    val oNEUSDT: ONEUSDT,
    @SerializedName("ONTBTC")
    val oNTBTC: ONTBTC,
    @SerializedName("ONTETH")
    val oNTETH: ONTETH,
    @SerializedName("ONTUSDT")
    val oNTUSDT: ONTUSDT,
    @SerializedName("PAXGBTC")
    val pAXGBTC: PAXGBTC,
    @SerializedName("PAXGUSDT")
    val pAXGUSDT: PAXGUSDT,
    @SerializedName("RUNEBTC")
    val rUNEBTC: RUNEBTC,
    @SerializedName("RUNEUSDT")
    val rUNEUSDT: RUNEUSDT,
    @SerializedName("SHIBBTC")
    val sHIBBTC: SHIBBTC,
    @SerializedName("SHIBUSDT")
    val sHIBUSDT: SHIBUSDT,
    @SerializedName("SOLBTC")
    val sOLBTC: SOLBTC,
    @SerializedName("THETABTC")
    val tHETABTC: THETABTC,
    @SerializedName("THETAUSDT")
    val tHETAUSDT: THETAUSDT,
    @SerializedName("TRXBTC")
    val tRXBTC: TRXBTC,
    @SerializedName("TRXETH")
    val tRXETH: TRXETH,
    @SerializedName("TRXUSDT")
    val tRXUSDT: TRXUSDT,
    @SerializedName("TUSDDAI")
    val tUSDDAI: TUSDDAI,
    @SerializedName("TUSDUSDC")
    val tUSDUSDC: TUSDUSDC,
    @SerializedName("UNIBTC")
    val uNIBTC: UNIBTC,
    @SerializedName("UNIUSDT")
    val uNIUSDT: UNIUSDT,
    @SerializedName("USDTDAI")
    val uSDTDAI: USDTDAI,
    @SerializedName("USDTTUSD")
    val uSDTTUSD: USDTTUSD,
    @SerializedName("USDTUSDC")
    val uSDTUSDC: USDTUSDC,
    @SerializedName("USDTUSDP")
    val uSDTUSDP: USDTUSDP,
    @SerializedName("VETBTC")
    val vETBTC: VETBTC,
    @SerializedName("VETETH")
    val vETETH: VETETH,
    @SerializedName("VETUSDT")
    val vETUSDT: VETUSDT,
    @SerializedName("XEMBTC")
    val xEMBTC: XEMBTC,
    @SerializedName("XEMETH")
    val xEMETH: XEMETH,
    @SerializedName("XEMUSDT")
    val xEMUSDT: XEMUSDT,
    @SerializedName("XLMBTC")
    val xLMBTC: XLMBTC,
    @SerializedName("XLMETH")
    val xLMETH: XLMETH,
    @SerializedName("XLMUSDT")
    val xLMUSDT: XLMUSDT,
    @SerializedName("XMRBTC")
    val xMRBTC: XMRBTC,
    @SerializedName("XMRETH")
    val xMRETH: XMRETH,
    @SerializedName("XMREURS")
    val xMREURS: XMREURS,
    @SerializedName("XMRUSDT")
    val xMRUSDT: XMRUSDT,
    @SerializedName("XRPBTC")
    val xRPBTC: XRPBTC,
    @SerializedName("XRPETH")
    val xRPETH: XRPETH,
    @SerializedName("XRPEURS")
    val xRPEURS: XRPEURS,
    @SerializedName("XRPUSDT")
    val xRPUSDT: XRPUSDT,
    @SerializedName("XTZBTC")
    val xTZBTC: XTZBTC,
    @SerializedName("XTZETH")
    val xTZETH: XTZETH,
    @SerializedName("XTZUSDT")
    val xTZUSDT: XTZUSDT,
    @SerializedName("YFIBTC")
    val yFIBTC: YFIBTC,
    @SerializedName("YFIUSDT")
    val yFIUSDT: YFIUSDT,
    @SerializedName("ZECBTC")
    val zECBTC: ZECBTC,
    @SerializedName("ZECETH")
    val zECETH: ZECETH,
    @SerializedName("ZECEURS")
    val zECEURS: ZECEURS,
    @SerializedName("ZECUSDT")
    val zECUSDT: ZECUSDT
)