package net.uoneweb.android.odpt

import com.google.gson.Gson
import javax.inject.Inject

class DummyRailwayDataSource @Inject constructor() {
    suspend fun getRailwayData(): List<Railway> {
        return Gson().fromJson(railwayJson, Array<Railway>::class.java).toList()
    }

    suspend fun getTrains(railway: String): List<Train> {
        return Gson().fromJson(trainJson, Array<Train>::class.java).toList()
    }

    suspend fun getRailDirections(): List<RailDirection> {
        return Gson().fromJson(railDirectionJson, Array<RailDirection>::class.java).toList()
    }

    suspend fun getTrainTypes(): List<TrainType> {
        return Gson().fromJson(trainTypeJson, Array<TrainType>::class.java).toList()
    }

    suspend fun getStations(operator: String): List<Station> {
        return Gson().fromJson(stationJson, Array<Station>::class.java).toList()
    }

    private val railwayJson = """
       [
  {
    "@id": "urn:ucode:_00001C00000000000001000003100E72",
    "@type": "odpt:Railway",
    "dc:date": "2021-08-17T10:00:00+09:00",
    "@context": "http://vocab.odpt.org/context_odpt.jsonld",
    "dc:title": "東京さくらトラム（都電荒川線）",
    "owl:sameAs": "odpt.Railway:Toei.Arakawa",
    "odpt:lineCode": "SA",
    "odpt:operator": "odpt.Operator:Toei",
    "odpt:railwayTitle": {
      "en": "Tokyo Sakura Tram (Arakawa Line)",
      "ja": "東京さくらトラム（都電荒川線）"
    },
    "odpt:stationOrder": [
      {
        "odpt:index": 1,
        "odpt:station": "odpt.Station:Toei.Arakawa.Minowabashi",
        "odpt:stationTitle": {
          "en": "Minowabashi",
          "ja": "三ノ輪橋"
        }
      },
      {
        "odpt:index": 2,
        "odpt:station": "odpt.Station:Toei.Arakawa.ArakawaItchumae",
        "odpt:stationTitle": {
          "en": "Arakawa-itchumae",
          "ja": "荒川一中前"
        }
      },
      {
        "odpt:index": 3,
        "odpt:station": "odpt.Station:Toei.Arakawa.Arakawakuyakushomae",
        "odpt:stationTitle": {
          "en": "Arakawakuyakushomae",
          "ja": "荒川区役所前"
        }
      },
      {
        "odpt:index": 4,
        "odpt:station": "odpt.Station:Toei.Arakawa.ArakawaNichome",
        "odpt:stationTitle": {
          "en": "Arakawa-nichome",
          "ja": "荒川二丁目"
        }
      },
      {
        "odpt:index": 5,
        "odpt:station": "odpt.Station:Toei.Arakawa.ArakawaNanachome",
        "odpt:stationTitle": {
          "en": "Arakawa-nanachome",
          "ja": "荒川七丁目"
        }
      },
      {
        "odpt:index": 6,
        "odpt:station": "odpt.Station:Toei.Arakawa.MachiyaEkimae",
        "odpt:stationTitle": {
          "en": "Machiya-ekimae",
          "ja": "町屋駅前"
        }
      },
      {
        "odpt:index": 7,
        "odpt:station": "odpt.Station:Toei.Arakawa.MachiyaNichome",
        "odpt:stationTitle": {
          "en": "Machiya-nichome",
          "ja": "町屋二丁目"
        }
      },
      {
        "odpt:index": 8,
        "odpt:station": "odpt.Station:Toei.Arakawa.HigashiOguSanchome",
        "odpt:stationTitle": {
          "en": "Higashi-ogu-sanchome",
          "ja": "東尾久三丁目"
        }
      },
      {
        "odpt:index": 9,
        "odpt:station": "odpt.Station:Toei.Arakawa.Kumanomae",
        "odpt:stationTitle": {
          "en": "Kumanomae",
          "ja": "熊野前"
        }
      },
      {
        "odpt:index": 10,
        "odpt:station": "odpt.Station:Toei.Arakawa.Miyanomae",
        "odpt:stationTitle": {
          "en": "Miyanomae",
          "ja": "宮ノ前"
        }
      },
      {
        "odpt:index": 11,
        "odpt:station": "odpt.Station:Toei.Arakawa.Odai",
        "odpt:stationTitle": {
          "en": "Odai",
          "ja": "小台"
        }
      },
      {
        "odpt:index": 12,
        "odpt:station": "odpt.Station:Toei.Arakawa.ArakawaYuenchimae",
        "odpt:stationTitle": {
          "en": "Arakawa-yuenchimae",
          "ja": "荒川遊園地前"
        }
      },
      {
        "odpt:index": 13,
        "odpt:station": "odpt.Station:Toei.Arakawa.ArakawaShakomae",
        "odpt:stationTitle": {
          "en": "Arakawa-shakomae",
          "ja": "荒川車庫前"
        }
      },
      {
        "odpt:index": 14,
        "odpt:station": "odpt.Station:Toei.Arakawa.Kajiwara",
        "odpt:stationTitle": {
          "en": "Kajiwara",
          "ja": "梶原"
        }
      },
      {
        "odpt:index": 15,
        "odpt:station": "odpt.Station:Toei.Arakawa.Sakaecho",
        "odpt:stationTitle": {
          "en": "Sakaecho",
          "ja": "栄町"
        }
      },
      {
        "odpt:index": 16,
        "odpt:station": "odpt.Station:Toei.Arakawa.OjiEkimae",
        "odpt:stationTitle": {
          "en": "Oji-ekimae",
          "ja": "王子駅前"
        }
      },
      {
        "odpt:index": 17,
        "odpt:station": "odpt.Station:Toei.Arakawa.Asukayama",
        "odpt:stationTitle": {
          "en": "Asukayama",
          "ja": "飛鳥山"
        }
      },
      {
        "odpt:index": 18,
        "odpt:station": "odpt.Station:Toei.Arakawa.TakinogawaItchome",
        "odpt:stationTitle": {
          "en": "Takinogawa-itchome",
          "ja": "滝野川一丁目"
        }
      },
      {
        "odpt:index": 19,
        "odpt:station": "odpt.Station:Toei.Arakawa.NishigaharaYonchome",
        "odpt:stationTitle": {
          "en": "Nishigahara-yonchome",
          "ja": "西ヶ原四丁目"
        }
      },
      {
        "odpt:index": 20,
        "odpt:station": "odpt.Station:Toei.Arakawa.ShinKoshinzuka",
        "odpt:stationTitle": {
          "en": "Shin-koshinzuka",
          "ja": "新庚申塚"
        }
      },
      {
        "odpt:index": 21,
        "odpt:station": "odpt.Station:Toei.Arakawa.Koshinzuka",
        "odpt:stationTitle": {
          "en": "Koshinzuka",
          "ja": "庚申塚"
        }
      },
      {
        "odpt:index": 22,
        "odpt:station": "odpt.Station:Toei.Arakawa.Sugamoshinden",
        "odpt:stationTitle": {
          "en": "Sugamoshinden",
          "ja": "巣鴨新田"
        }
      },
      {
        "odpt:index": 23,
        "odpt:station": "odpt.Station:Toei.Arakawa.OtsukaEkimae",
        "odpt:stationTitle": {
          "en": "Otsuka-ekimae",
          "ja": "大塚駅前"
        }
      },
      {
        "odpt:index": 24,
        "odpt:station": "odpt.Station:Toei.Arakawa.Mukohara",
        "odpt:stationTitle": {
          "en": "Mukohara",
          "ja": "向原"
        }
      },
      {
        "odpt:index": 25,
        "odpt:station": "odpt.Station:Toei.Arakawa.HigashiIkebukuroYonchome",
        "odpt:stationTitle": {
          "en": "Higashi-ikebukuro-yonchome",
          "ja": "東池袋四丁目"
        }
      },
      {
        "odpt:index": 26,
        "odpt:station": "odpt.Station:Toei.Arakawa.TodenZoshigaya",
        "odpt:stationTitle": {
          "en": "Toden-zoshigaya",
          "ja": "都電雑司ヶ谷"
        }
      },
      {
        "odpt:index": 27,
        "odpt:station": "odpt.Station:Toei.Arakawa.Kishibojimmae",
        "odpt:stationTitle": {
          "en": "Kishibojimmae",
          "ja": "鬼子母神前"
        }
      },
      {
        "odpt:index": 28,
        "odpt:station": "odpt.Station:Toei.Arakawa.Gakushuinshita",
        "odpt:stationTitle": {
          "en": "Gakushuinshita",
          "ja": "学習院下"
        }
      },
      {
        "odpt:index": 29,
        "odpt:station": "odpt.Station:Toei.Arakawa.Omokagebashi",
        "odpt:stationTitle": {
          "en": "Omokagebashi",
          "ja": "面影橋"
        }
      },
      {
        "odpt:index": 30,
        "odpt:station": "odpt.Station:Toei.Arakawa.Waseda",
        "odpt:stationTitle": {
          "en": "Waseda",
          "ja": "早稲田"
        }
      }
    ],
    "odpt:ascendingRailDirection": "odpt.RailDirection:Toei.Waseda",
    "odpt:descendingRailDirection": "odpt.RailDirection:Toei.Minowabashi"
  },
  {
    "@id": "urn:ucode:_00001C00000000000001000003100E6E",
    "@type": "odpt:Railway",
    "dc:date": "2021-08-17T10:00:00+09:00",
    "@context": "http://vocab.odpt.org/context_odpt.jsonld",
    "dc:title": "浅草線",
    "odpt:color": "#FF535F",
    "owl:sameAs": "odpt.Railway:Toei.Asakusa",
    "odpt:lineCode": "A",
    "odpt:operator": "odpt.Operator:Toei",
    "odpt:railwayTitle": {
      "en": "Asakusa Line",
      "ja": "浅草線"
    },
    "odpt:stationOrder": [
      {
        "odpt:index": 1,
        "odpt:station": "odpt.Station:Toei.Asakusa.NishiMagome",
        "odpt:stationTitle": {
          "en": "Nishi-magome",
          "ja": "西馬込"
        }
      },
      {
        "odpt:index": 2,
        "odpt:station": "odpt.Station:Toei.Asakusa.Magome",
        "odpt:stationTitle": {
          "en": "Magome",
          "ja": "馬込"
        }
      },
      {
        "odpt:index": 3,
        "odpt:station": "odpt.Station:Toei.Asakusa.Nakanobu",
        "odpt:stationTitle": {
          "en": "Nakanobu",
          "ja": "中延"
        }
      },
      {
        "odpt:index": 4,
        "odpt:station": "odpt.Station:Toei.Asakusa.Togoshi",
        "odpt:stationTitle": {
          "en": "Togoshi",
          "ja": "戸越"
        }
      },
      {
        "odpt:index": 5,
        "odpt:station": "odpt.Station:Toei.Asakusa.Gotanda",
        "odpt:stationTitle": {
          "en": "Gotanda",
          "ja": "五反田"
        }
      },
      {
        "odpt:index": 6,
        "odpt:station": "odpt.Station:Toei.Asakusa.Takanawadai",
        "odpt:stationTitle": {
          "en": "Takanawadai",
          "ja": "高輪台"
        }
      },
      {
        "odpt:index": 7,
        "odpt:station": "odpt.Station:Toei.Asakusa.Sengakuji",
        "odpt:stationTitle": {
          "en": "Sengakuji",
          "ja": "泉岳寺"
        }
      },
      {
        "odpt:index": 8,
        "odpt:station": "odpt.Station:Toei.Asakusa.Mita",
        "odpt:stationTitle": {
          "en": "Mita",
          "ja": "三田"
        }
      },
      {
        "odpt:index": 9,
        "odpt:station": "odpt.Station:Toei.Asakusa.Daimon",
        "odpt:stationTitle": {
          "en": "Daimon",
          "ja": "大門"
        }
      },
      {
        "odpt:index": 10,
        "odpt:station": "odpt.Station:Toei.Asakusa.Shimbashi",
        "odpt:stationTitle": {
          "en": "Shimbashi",
          "ja": "新橋"
        }
      },
      {
        "odpt:index": 11,
        "odpt:station": "odpt.Station:Toei.Asakusa.HigashiGinza",
        "odpt:stationTitle": {
          "en": "Higashi-ginza",
          "ja": "東銀座"
        }
      },
      {
        "odpt:index": 12,
        "odpt:station": "odpt.Station:Toei.Asakusa.Takaracho",
        "odpt:stationTitle": {
          "en": "Takaracho",
          "ja": "宝町"
        }
      },
      {
        "odpt:index": 13,
        "odpt:station": "odpt.Station:Toei.Asakusa.Nihombashi",
        "odpt:stationTitle": {
          "en": "Nihombashi",
          "ja": "日本橋"
        }
      },
      {
        "odpt:index": 14,
        "odpt:station": "odpt.Station:Toei.Asakusa.Ningyocho",
        "odpt:stationTitle": {
          "en": "Ningyocho",
          "ja": "人形町"
        }
      },
      {
        "odpt:index": 15,
        "odpt:station": "odpt.Station:Toei.Asakusa.HigashiNihombashi",
        "odpt:stationTitle": {
          "en": "Higashi-nihombashi",
          "ja": "東日本橋"
        }
      },
      {
        "odpt:index": 16,
        "odpt:station": "odpt.Station:Toei.Asakusa.Asakusabashi",
        "odpt:stationTitle": {
          "en": "Asakusabashi",
          "ja": "浅草橋"
        }
      },
      {
        "odpt:index": 17,
        "odpt:station": "odpt.Station:Toei.Asakusa.Kuramae",
        "odpt:stationTitle": {
          "en": "Kuramae",
          "ja": "蔵前"
        }
      },
      {
        "odpt:index": 18,
        "odpt:station": "odpt.Station:Toei.Asakusa.Asakusa",
        "odpt:stationTitle": {
          "en": "Asakusa",
          "ja": "浅草"
        }
      },
      {
        "odpt:index": 19,
        "odpt:station": "odpt.Station:Toei.Asakusa.HonjoAzumabashi",
        "odpt:stationTitle": {
          "en": "Honjo-azumabashi",
          "ja": "本所吾妻橋"
        }
      },
      {
        "odpt:index": 20,
        "odpt:station": "odpt.Station:Toei.Asakusa.Oshiage",
        "odpt:stationTitle": {
          "en": "Oshiage",
          "ja": "押上"
        }
      }
    ],
    "odpt:ascendingRailDirection": "odpt.RailDirection:Northbound",
    "odpt:descendingRailDirection": "odpt.RailDirection:Southbound"
  },
  {
    "@id": "urn:ucode:_00001C00000000000001000003100E6F",
    "@type": "odpt:Railway",
    "dc:date": "2021-08-17T10:00:00+09:00",
    "@context": "http://vocab.odpt.org/context_odpt.jsonld",
    "dc:title": "三田線",
    "odpt:color": "#0067B0",
    "owl:sameAs": "odpt.Railway:Toei.Mita",
    "odpt:lineCode": "I",
    "odpt:operator": "odpt.Operator:Toei",
    "odpt:railwayTitle": {
      "en": "Mita Line",
      "ja": "三田線"
    },
    "odpt:stationOrder": [
      {
        "odpt:index": 1,
        "odpt:station": "odpt.Station:Toei.Mita.Meguro",
        "odpt:stationTitle": {
          "en": "Meguro",
          "ja": "目黒"
        }
      },
      {
        "odpt:index": 2,
        "odpt:station": "odpt.Station:Toei.Mita.Shirokanedai",
        "odpt:stationTitle": {
          "en": "Shirokanedai",
          "ja": "白金台"
        }
      },
      {
        "odpt:index": 3,
        "odpt:station": "odpt.Station:Toei.Mita.ShirokaneTakanawa",
        "odpt:stationTitle": {
          "en": "Shirokane-takanawa",
          "ja": "白金高輪"
        }
      },
      {
        "odpt:index": 4,
        "odpt:station": "odpt.Station:Toei.Mita.Mita",
        "odpt:stationTitle": {
          "en": "Mita",
          "ja": "三田"
        }
      },
      {
        "odpt:index": 5,
        "odpt:station": "odpt.Station:Toei.Mita.Shibakoen",
        "odpt:stationTitle": {
          "en": "Shibakoen",
          "ja": "芝公園"
        }
      },
      {
        "odpt:index": 6,
        "odpt:station": "odpt.Station:Toei.Mita.Onarimon",
        "odpt:stationTitle": {
          "en": "Onarimon",
          "ja": "御成門"
        }
      },
      {
        "odpt:index": 7,
        "odpt:station": "odpt.Station:Toei.Mita.Uchisaiwaicho",
        "odpt:stationTitle": {
          "en": "Uchisaiwaicho",
          "ja": "内幸町"
        }
      },
      {
        "odpt:index": 8,
        "odpt:station": "odpt.Station:Toei.Mita.Hibiya",
        "odpt:stationTitle": {
          "en": "Hibiya",
          "ja": "日比谷"
        }
      },
      {
        "odpt:index": 9,
        "odpt:station": "odpt.Station:Toei.Mita.Otemachi",
        "odpt:stationTitle": {
          "en": "Otemachi",
          "ja": "大手町"
        }
      },
      {
        "odpt:index": 10,
        "odpt:station": "odpt.Station:Toei.Mita.Jimbocho",
        "odpt:stationTitle": {
          "en": "Jimbocho",
          "ja": "神保町"
        }
      },
      {
        "odpt:index": 11,
        "odpt:station": "odpt.Station:Toei.Mita.Suidobashi",
        "odpt:stationTitle": {
          "en": "Suidobashi",
          "ja": "水道橋"
        }
      },
      {
        "odpt:index": 12,
        "odpt:station": "odpt.Station:Toei.Mita.Kasuga",
        "odpt:stationTitle": {
          "en": "Kasuga",
          "ja": "春日"
        }
      },
      {
        "odpt:index": 13,
        "odpt:station": "odpt.Station:Toei.Mita.Hakusan",
        "odpt:stationTitle": {
          "en": "Hakusan",
          "ja": "白山"
        }
      },
      {
        "odpt:index": 14,
        "odpt:station": "odpt.Station:Toei.Mita.Sengoku",
        "odpt:stationTitle": {
          "en": "Sengoku",
          "ja": "千石"
        }
      },
      {
        "odpt:index": 15,
        "odpt:station": "odpt.Station:Toei.Mita.Sugamo",
        "odpt:stationTitle": {
          "en": "Sugamo",
          "ja": "巣鴨"
        }
      },
      {
        "odpt:index": 16,
        "odpt:station": "odpt.Station:Toei.Mita.NishiSugamo",
        "odpt:stationTitle": {
          "en": "Nishi-sugamo",
          "ja": "西巣鴨"
        }
      },
      {
        "odpt:index": 17,
        "odpt:station": "odpt.Station:Toei.Mita.ShinItabashi",
        "odpt:stationTitle": {
          "en": "Shin-itabashi",
          "ja": "新板橋"
        }
      },
      {
        "odpt:index": 18,
        "odpt:station": "odpt.Station:Toei.Mita.ItabashiKuyakushomae",
        "odpt:stationTitle": {
          "en": "Itabashi-kuyakushomae",
          "ja": "板橋区役所前"
        }
      },
      {
        "odpt:index": 19,
        "odpt:station": "odpt.Station:Toei.Mita.Itabashihoncho",
        "odpt:stationTitle": {
          "en": "Itabashihoncho",
          "ja": "板橋本町"
        }
      },
      {
        "odpt:index": 20,
        "odpt:station": "odpt.Station:Toei.Mita.Motohasunuma",
        "odpt:stationTitle": {
          "en": "Motohasunuma",
          "ja": "本蓮沼"
        }
      },
      {
        "odpt:index": 21,
        "odpt:station": "odpt.Station:Toei.Mita.ShimuraSakaue",
        "odpt:stationTitle": {
          "en": "Shimura-sakaue",
          "ja": "志村坂上"
        }
      },
      {
        "odpt:index": 22,
        "odpt:station": "odpt.Station:Toei.Mita.ShimuraSanchome",
        "odpt:stationTitle": {
          "en": "Shimura-sanchome",
          "ja": "志村三丁目"
        }
      },
      {
        "odpt:index": 23,
        "odpt:station": "odpt.Station:Toei.Mita.Hasune",
        "odpt:stationTitle": {
          "en": "Hasune",
          "ja": "蓮根"
        }
      },
      {
        "odpt:index": 24,
        "odpt:station": "odpt.Station:Toei.Mita.Nishidai",
        "odpt:stationTitle": {
          "en": "Nishidai",
          "ja": "西台"
        }
      },
      {
        "odpt:index": 25,
        "odpt:station": "odpt.Station:Toei.Mita.Takashimadaira",
        "odpt:stationTitle": {
          "en": "Takashimadaira",
          "ja": "高島平"
        }
      },
      {
        "odpt:index": 26,
        "odpt:station": "odpt.Station:Toei.Mita.ShinTakashimadaira",
        "odpt:stationTitle": {
          "en": "Shin-takashimadaira",
          "ja": "新高島平"
        }
      },
      {
        "odpt:index": 27,
        "odpt:station": "odpt.Station:Toei.Mita.NishiTakashimadaira",
        "odpt:stationTitle": {
          "en": "Nishi-takashimadaira",
          "ja": "西高島平"
        }
      }
    ],
    "odpt:ascendingRailDirection": "odpt.RailDirection:Northbound",
    "odpt:descendingRailDirection": "odpt.RailDirection:Southbound"
  },
  {
    "@id": "urn:ucode:_00001C00000000000001000003100E73",
    "@type": "odpt:Railway",
    "dc:date": "2021-08-17T10:00:00+09:00",
    "@context": "http://vocab.odpt.org/context_odpt.jsonld",
    "dc:title": "日暮里・舎人ライナー",
    "owl:sameAs": "odpt.Railway:Toei.NipporiToneri",
    "odpt:lineCode": "NT",
    "odpt:operator": "odpt.Operator:Toei",
    "odpt:railwayTitle": {
      "en": "Nippori-Toneri Liner",
      "ja": "日暮里・舎人ライナー"
    },
    "odpt:stationOrder": [
      {
        "odpt:index": 1,
        "odpt:station": "odpt.Station:Toei.NipporiToneri.Nippori",
        "odpt:stationTitle": {
          "en": "Nippori",
          "ja": "日暮里"
        }
      },
      {
        "odpt:index": 2,
        "odpt:station": "odpt.Station:Toei.NipporiToneri.NishiNippori",
        "odpt:stationTitle": {
          "en": "Nishi-nippori",
          "ja": "西日暮里"
        }
      },
      {
        "odpt:index": 3,
        "odpt:station": "odpt.Station:Toei.NipporiToneri.AkadoShogakkomae",
        "odpt:stationTitle": {
          "en": "Akado-shogakkomae",
          "ja": "赤土小学校前"
        }
      },
      {
        "odpt:index": 4,
        "odpt:station": "odpt.Station:Toei.NipporiToneri.Kumanomae",
        "odpt:stationTitle": {
          "en": "Kumanomae",
          "ja": "熊野前"
        }
      },
      {
        "odpt:index": 5,
        "odpt:station": "odpt.Station:Toei.NipporiToneri.AdachiOdai",
        "odpt:stationTitle": {
          "en": "Adachi-odai",
          "ja": "足立小台"
        }
      },
      {
        "odpt:index": 6,
        "odpt:station": "odpt.Station:Toei.NipporiToneri.OgiOhashi",
        "odpt:stationTitle": {
          "en": "Ogi-ohashi",
          "ja": "扇大橋"
        }
      },
      {
        "odpt:index": 7,
        "odpt:station": "odpt.Station:Toei.NipporiToneri.Koya",
        "odpt:stationTitle": {
          "en": "Koya",
          "ja": "高野"
        }
      },
      {
        "odpt:index": 8,
        "odpt:station": "odpt.Station:Toei.NipporiToneri.Kohoku",
        "odpt:stationTitle": {
          "en": "Kohoku",
          "ja": "江北"
        }
      },
      {
        "odpt:index": 9,
        "odpt:station": "odpt.Station:Toei.NipporiToneri.NishiaraidaishiNishi",
        "odpt:stationTitle": {
          "en": "Nishiaraidaishi-nishi",
          "ja": "西新井大師西"
        }
      },
      {
        "odpt:index": 10,
        "odpt:station": "odpt.Station:Toei.NipporiToneri.Yazaike",
        "odpt:stationTitle": {
          "en": "Yazaike",
          "ja": "谷在家"
        }
      },
      {
        "odpt:index": 11,
        "odpt:station": "odpt.Station:Toei.NipporiToneri.ToneriKoen",
        "odpt:stationTitle": {
          "en": "Toneri-koen",
          "ja": "舎人公園"
        }
      },
      {
        "odpt:index": 12,
        "odpt:station": "odpt.Station:Toei.NipporiToneri.Toneri",
        "odpt:stationTitle": {
          "en": "Toneri",
          "ja": "舎人"
        }
      },
      {
        "odpt:index": 13,
        "odpt:station": "odpt.Station:Toei.NipporiToneri.MinumadaiShinsuikoen",
        "odpt:stationTitle": {
          "en": "Minumadai-shinsuikoen",
          "ja": "見沼代親水公園"
        }
      }
    ],
    "odpt:ascendingRailDirection": "odpt.RailDirection:Outbound",
    "odpt:descendingRailDirection": "odpt.RailDirection:Inbound"
  },
  {
    "@id": "urn:ucode:_00001C00000000000001000003100E71",
    "@type": "odpt:Railway",
    "dc:date": "2021-08-17T10:00:00+09:00",
    "@context": "http://vocab.odpt.org/context_odpt.jsonld",
    "dc:title": "大江戸線",
    "odpt:color": "#CF3366",
    "owl:sameAs": "odpt.Railway:Toei.Oedo",
    "odpt:lineCode": "E",
    "odpt:operator": "odpt.Operator:Toei",
    "odpt:railwayTitle": {
      "en": "Oedo Line",
      "ja": "大江戸線"
    },
    "odpt:stationOrder": [
      {
        "odpt:index": 1,
        "odpt:station": "odpt.Station:Toei.Oedo.Tochomae",
        "odpt:stationTitle": {
          "en": "Tochomae",
          "ja": "都庁前"
        }
      },
      {
        "odpt:index": 2,
        "odpt:station": "odpt.Station:Toei.Oedo.ShinjukuNishiguchi",
        "odpt:stationTitle": {
          "en": "Shinjuku-nishiguchi",
          "ja": "新宿西口"
        }
      },
      {
        "odpt:index": 3,
        "odpt:station": "odpt.Station:Toei.Oedo.HigashiShinjuku",
        "odpt:stationTitle": {
          "en": "Higashi-shinjuku",
          "ja": "東新宿"
        }
      },
      {
        "odpt:index": 4,
        "odpt:station": "odpt.Station:Toei.Oedo.WakamatsuKawada",
        "odpt:stationTitle": {
          "en": "Wakamatsu-kawada",
          "ja": "若松河田"
        }
      },
      {
        "odpt:index": 5,
        "odpt:station": "odpt.Station:Toei.Oedo.UshigomeYanagicho",
        "odpt:stationTitle": {
          "en": "Ushigome-yanagicho",
          "ja": "牛込柳町"
        }
      },
      {
        "odpt:index": 6,
        "odpt:station": "odpt.Station:Toei.Oedo.UshigomeKagurazaka",
        "odpt:stationTitle": {
          "en": "Ushigome-kagurazaka",
          "ja": "牛込神楽坂"
        }
      },
      {
        "odpt:index": 7,
        "odpt:station": "odpt.Station:Toei.Oedo.Iidabashi",
        "odpt:stationTitle": {
          "en": "Iidabashi",
          "ja": "飯田橋"
        }
      },
      {
        "odpt:index": 8,
        "odpt:station": "odpt.Station:Toei.Oedo.Kasuga",
        "odpt:stationTitle": {
          "en": "Kasuga",
          "ja": "春日"
        }
      },
      {
        "odpt:index": 9,
        "odpt:station": "odpt.Station:Toei.Oedo.HongoSanchome",
        "odpt:stationTitle": {
          "en": "Hongo-sanchome",
          "ja": "本郷三丁目"
        }
      },
      {
        "odpt:index": 10,
        "odpt:station": "odpt.Station:Toei.Oedo.UenoOkachimachi",
        "odpt:stationTitle": {
          "en": "Ueno-okachimachi",
          "ja": "上野御徒町"
        }
      },
      {
        "odpt:index": 11,
        "odpt:station": "odpt.Station:Toei.Oedo.ShinOkachimachi",
        "odpt:stationTitle": {
          "en": "Shin-okachimachi",
          "ja": "新御徒町"
        }
      },
      {
        "odpt:index": 12,
        "odpt:station": "odpt.Station:Toei.Oedo.Kuramae",
        "odpt:stationTitle": {
          "en": "Kuramae",
          "ja": "蔵前"
        }
      },
      {
        "odpt:index": 13,
        "odpt:station": "odpt.Station:Toei.Oedo.Ryogoku",
        "odpt:stationTitle": {
          "en": "Ryogoku",
          "ja": "両国"
        }
      },
      {
        "odpt:index": 14,
        "odpt:station": "odpt.Station:Toei.Oedo.Morishita",
        "odpt:stationTitle": {
          "en": "Morishita",
          "ja": "森下"
        }
      },
      {
        "odpt:index": 15,
        "odpt:station": "odpt.Station:Toei.Oedo.KiyosumiShirakawa",
        "odpt:stationTitle": {
          "en": "Kiyosumi-shirakawa",
          "ja": "清澄白河"
        }
      },
      {
        "odpt:index": 16,
        "odpt:station": "odpt.Station:Toei.Oedo.MonzenNakacho",
        "odpt:stationTitle": {
          "en": "Monzen-nakacho",
          "ja": "門前仲町"
        }
      },
      {
        "odpt:index": 17,
        "odpt:station": "odpt.Station:Toei.Oedo.Tsukishima",
        "odpt:stationTitle": {
          "en": "Tsukishima",
          "ja": "月島"
        }
      },
      {
        "odpt:index": 18,
        "odpt:station": "odpt.Station:Toei.Oedo.Kachidoki",
        "odpt:stationTitle": {
          "en": "Kachidoki",
          "ja": "勝どき"
        }
      },
      {
        "odpt:index": 19,
        "odpt:station": "odpt.Station:Toei.Oedo.Tsukijishijo",
        "odpt:stationTitle": {
          "en": "Tsukijishijo",
          "ja": "築地市場"
        }
      },
      {
        "odpt:index": 20,
        "odpt:station": "odpt.Station:Toei.Oedo.Shiodome",
        "odpt:stationTitle": {
          "en": "Shiodome",
          "ja": "汐留"
        }
      },
      {
        "odpt:index": 21,
        "odpt:station": "odpt.Station:Toei.Oedo.Daimon",
        "odpt:stationTitle": {
          "en": "Daimon",
          "ja": "大門"
        }
      },
      {
        "odpt:index": 22,
        "odpt:station": "odpt.Station:Toei.Oedo.Akabanebashi",
        "odpt:stationTitle": {
          "en": "Akabanebashi",
          "ja": "赤羽橋"
        }
      },
      {
        "odpt:index": 23,
        "odpt:station": "odpt.Station:Toei.Oedo.AzabuJuban",
        "odpt:stationTitle": {
          "en": "Azabu-juban",
          "ja": "麻布十番"
        }
      },
      {
        "odpt:index": 24,
        "odpt:station": "odpt.Station:Toei.Oedo.Roppongi",
        "odpt:stationTitle": {
          "en": "Roppongi",
          "ja": "六本木"
        }
      },
      {
        "odpt:index": 25,
        "odpt:station": "odpt.Station:Toei.Oedo.AoyamaItchome",
        "odpt:stationTitle": {
          "en": "Aoyama-itchome",
          "ja": "青山一丁目"
        }
      },
      {
        "odpt:index": 26,
        "odpt:station": "odpt.Station:Toei.Oedo.KokuritsuKyogijo",
        "odpt:stationTitle": {
          "en": "Kokuritsu-kyogijo",
          "ja": "国立競技場"
        }
      },
      {
        "odpt:index": 27,
        "odpt:station": "odpt.Station:Toei.Oedo.Yoyogi",
        "odpt:stationTitle": {
          "en": "Yoyogi",
          "ja": "代々木"
        }
      },
      {
        "odpt:index": 28,
        "odpt:station": "odpt.Station:Toei.Oedo.Shinjuku",
        "odpt:stationTitle": {
          "en": "Shinjuku",
          "ja": "新宿"
        }
      },
      {
        "odpt:index": 29,
        "odpt:station": "odpt.Station:Toei.Oedo.Tochomae",
        "odpt:stationTitle": {
          "en": "Tochomae",
          "ja": "都庁前"
        }
      },
      {
        "odpt:index": 30,
        "odpt:station": "odpt.Station:Toei.Oedo.NishiShinjukuGochome",
        "odpt:stationTitle": {
          "en": "Nishi-shinjuku-gochome",
          "ja": "西新宿五丁目"
        }
      },
      {
        "odpt:index": 31,
        "odpt:station": "odpt.Station:Toei.Oedo.NakanoSakaue",
        "odpt:stationTitle": {
          "en": "Nakano-sakaue",
          "ja": "中野坂上"
        }
      },
      {
        "odpt:index": 32,
        "odpt:station": "odpt.Station:Toei.Oedo.HigashiNakano",
        "odpt:stationTitle": {
          "en": "Higashi-nakano",
          "ja": "東中野"
        }
      },
      {
        "odpt:index": 33,
        "odpt:station": "odpt.Station:Toei.Oedo.Nakai",
        "odpt:stationTitle": {
          "en": "Nakai",
          "ja": "中井"
        }
      },
      {
        "odpt:index": 34,
        "odpt:station": "odpt.Station:Toei.Oedo.OchiaiMinamiNagasaki",
        "odpt:stationTitle": {
          "en": "Ochiai-minami-nagasaki",
          "ja": "落合南長崎"
        }
      },
      {
        "odpt:index": 35,
        "odpt:station": "odpt.Station:Toei.Oedo.ShinEgota",
        "odpt:stationTitle": {
          "en": "Shin-egota",
          "ja": "新江古田"
        }
      },
      {
        "odpt:index": 36,
        "odpt:station": "odpt.Station:Toei.Oedo.Nerima",
        "odpt:stationTitle": {
          "en": "Nerima",
          "ja": "練馬"
        }
      },
      {
        "odpt:index": 37,
        "odpt:station": "odpt.Station:Toei.Oedo.Toshimaen",
        "odpt:stationTitle": {
          "en": "Toshimaen",
          "ja": "豊島園"
        }
      },
      {
        "odpt:index": 38,
        "odpt:station": "odpt.Station:Toei.Oedo.NerimaKasugacho",
        "odpt:stationTitle": {
          "en": "Nerima-kasugacho",
          "ja": "練馬春日町"
        }
      },
      {
        "odpt:index": 39,
        "odpt:station": "odpt.Station:Toei.Oedo.Hikarigaoka",
        "odpt:stationTitle": {
          "en": "Hikarigaoka",
          "ja": "光が丘"
        }
      }
    ],
    "odpt:ascendingRailDirection": "odpt.RailDirection:OuterLoop",
    "odpt:descendingRailDirection": "odpt.RailDirection:InnerLoop"
  },
  {
    "@id": "urn:ucode:_00001C00000000000001000003100E70",
    "@type": "odpt:Railway",
    "dc:date": "2021-08-17T10:00:00+09:00",
    "@context": "http://vocab.odpt.org/context_odpt.jsonld",
    "dc:title": "新宿線",
    "odpt:color": "#9FB01C",
    "owl:sameAs": "odpt.Railway:Toei.Shinjuku",
    "odpt:lineCode": "S",
    "odpt:operator": "odpt.Operator:Toei",
    "odpt:railwayTitle": {
      "en": "Shinjuku Line",
      "ja": "新宿線"
    },
    "odpt:stationOrder": [
      {
        "odpt:index": 1,
        "odpt:station": "odpt.Station:Toei.Shinjuku.Shinjuku",
        "odpt:stationTitle": {
          "en": "Shinjuku",
          "ja": "新宿"
        }
      },
      {
        "odpt:index": 2,
        "odpt:station": "odpt.Station:Toei.Shinjuku.ShinjukuSanchome",
        "odpt:stationTitle": {
          "en": "Shinjuku-sanchome",
          "ja": "新宿三丁目"
        }
      },
      {
        "odpt:index": 3,
        "odpt:station": "odpt.Station:Toei.Shinjuku.Akebonobashi",
        "odpt:stationTitle": {
          "en": "Akebonobashi",
          "ja": "曙橋"
        }
      },
      {
        "odpt:index": 4,
        "odpt:station": "odpt.Station:Toei.Shinjuku.Ichigaya",
        "odpt:stationTitle": {
          "en": "Ichigaya",
          "ja": "市ヶ谷"
        }
      },
      {
        "odpt:index": 5,
        "odpt:station": "odpt.Station:Toei.Shinjuku.Kudanshita",
        "odpt:stationTitle": {
          "en": "Kudanshita",
          "ja": "九段下"
        }
      },
      {
        "odpt:index": 6,
        "odpt:station": "odpt.Station:Toei.Shinjuku.Jimbocho",
        "odpt:stationTitle": {
          "en": "Jimbocho",
          "ja": "神保町"
        }
      },
      {
        "odpt:index": 7,
        "odpt:station": "odpt.Station:Toei.Shinjuku.Ogawamachi",
        "odpt:stationTitle": {
          "en": "Ogawamachi",
          "ja": "小川町"
        }
      },
      {
        "odpt:index": 8,
        "odpt:station": "odpt.Station:Toei.Shinjuku.Iwamotocho",
        "odpt:stationTitle": {
          "en": "Iwamotocho",
          "ja": "岩本町"
        }
      },
      {
        "odpt:index": 9,
        "odpt:station": "odpt.Station:Toei.Shinjuku.BakuroYokoyama",
        "odpt:stationTitle": {
          "en": "Bakuro-yokoyama",
          "ja": "馬喰横山"
        }
      },
      {
        "odpt:index": 10,
        "odpt:station": "odpt.Station:Toei.Shinjuku.Hamacho",
        "odpt:stationTitle": {
          "en": "Hamacho",
          "ja": "浜町"
        }
      },
      {
        "odpt:index": 11,
        "odpt:station": "odpt.Station:Toei.Shinjuku.Morishita",
        "odpt:stationTitle": {
          "en": "Morishita",
          "ja": "森下"
        }
      },
      {
        "odpt:index": 12,
        "odpt:station": "odpt.Station:Toei.Shinjuku.Kikukawa",
        "odpt:stationTitle": {
          "en": "Kikukawa",
          "ja": "菊川"
        }
      },
      {
        "odpt:index": 13,
        "odpt:station": "odpt.Station:Toei.Shinjuku.Sumiyoshi",
        "odpt:stationTitle": {
          "en": "Sumiyoshi",
          "ja": "住吉"
        }
      },
      {
        "odpt:index": 14,
        "odpt:station": "odpt.Station:Toei.Shinjuku.NishiOjima",
        "odpt:stationTitle": {
          "en": "Nishi-ojima",
          "ja": "西大島"
        }
      },
      {
        "odpt:index": 15,
        "odpt:station": "odpt.Station:Toei.Shinjuku.Ojima",
        "odpt:stationTitle": {
          "en": "Ojima",
          "ja": "大島"
        }
      },
      {
        "odpt:index": 16,
        "odpt:station": "odpt.Station:Toei.Shinjuku.HigashiOjima",
        "odpt:stationTitle": {
          "en": "Higashi-ojima",
          "ja": "東大島"
        }
      },
      {
        "odpt:index": 17,
        "odpt:station": "odpt.Station:Toei.Shinjuku.Funabori",
        "odpt:stationTitle": {
          "en": "Funabori",
          "ja": "船堀"
        }
      },
      {
        "odpt:index": 18,
        "odpt:station": "odpt.Station:Toei.Shinjuku.Ichinoe",
        "odpt:stationTitle": {
          "en": "Ichinoe",
          "ja": "一之江"
        }
      },
      {
        "odpt:index": 19,
        "odpt:station": "odpt.Station:Toei.Shinjuku.Mizue",
        "odpt:stationTitle": {
          "en": "Mizue",
          "ja": "瑞江"
        }
      },
      {
        "odpt:index": 20,
        "odpt:station": "odpt.Station:Toei.Shinjuku.Shinozaki",
        "odpt:stationTitle": {
          "en": "Shinozaki",
          "ja": "篠崎"
        }
      },
      {
        "odpt:index": 21,
        "odpt:station": "odpt.Station:Toei.Shinjuku.Motoyawata",
        "odpt:stationTitle": {
          "en": "Motoyawata",
          "ja": "本八幡"
        }
      }
    ],
    "odpt:ascendingRailDirection": "odpt.RailDirection:Eastbound",
    "odpt:descendingRailDirection": "odpt.RailDirection:Westbound"
  }
] 
    """.trimIndent()

    private val trainJson = """
            [
              {
                "@id": "urn:uuid:ba083181-e31c-48ca-bfce-6be36d8bd4e0",
                "@type": "odpt:Train",
                "dc:date": "2023-11-23T23:44:26+09:00",
                "@context": "http://vocab.odpt.org/context_odpt.jsonld",
                "dct:valid": "2023-11-23T23:45:26+09:00",
                "odpt:delay": 0,
                "owl:sameAs": "odpt.Train:Toei.Oedo.2324B",
                "odpt:railway": "odpt.Railway:Toei.Oedo",
                "odpt:operator": "odpt.Operator:Toei",
                "odpt:toStation": null,
                "odpt:trainType": "odpt.TrainType:Toei.Local",
                "odpt:fromStation": "odpt.Station:Toei.Oedo.UenoOkachimachi",
                "odpt:trainNumber": "2324B",
                "odpt:originStation": [
                  "odpt.Station:Toei.Oedo.Tochomae"
                ],
                "odpt:railDirection": "odpt.RailDirection:OuterLoop",
                "odpt:destinationStation": [
                  "odpt.Station:Toei.Oedo.Hikarigaoka"
                ]
              },
              {
                "@id": "urn:uuid:b7149e36-5996-49dd-abd9-5a7668319f51",
                "@type": "odpt:Train",
                "dc:date": "2023-11-23T23:44:26+09:00",
                "@context": "http://vocab.odpt.org/context_odpt.jsonld",
                "dct:valid": "2023-11-23T23:45:26+09:00",
                "odpt:delay": 0,
                "owl:sameAs": "odpt.Train:Toei.Oedo.2228A",
                "odpt:railway": "odpt.Railway:Toei.Oedo",
                "odpt:operator": "odpt.Operator:Toei",
                "odpt:toStation": null,
                "odpt:trainType": "odpt.TrainType:Toei.Local",
                "odpt:fromStation": "odpt.Station:Toei.Oedo.HigashiShinjuku",
                "odpt:trainNumber": "2228A",
                "odpt:originStation": [
                  "odpt.Station:Toei.Oedo.Hikarigaoka"
                ],
                "odpt:railDirection": "odpt.RailDirection:InnerLoop",
                "odpt:destinationStation": [
                  "odpt.Station:Toei.Oedo.Tochomae"
                ]
              },
              {
                "@id": "urn:uuid:48a5fcb5-1079-4037-a671-e7330728e26c",
                "@type": "odpt:Train",
                "dc:date": "2023-11-23T23:44:26+09:00",
                "@context": "http://vocab.odpt.org/context_odpt.jsonld",
                "dct:valid": "2023-11-23T23:45:26+09:00",
                "odpt:delay": 0,
                "owl:sameAs": "odpt.Train:Toei.Oedo.2231A",
                "odpt:railway": "odpt.Railway:Toei.Oedo",
                "odpt:operator": "odpt.Operator:Toei",
                "odpt:toStation": null,
                "odpt:trainType": "odpt.TrainType:Toei.Local",
                "odpt:fromStation": "odpt.Station:Toei.Oedo.HongoSanchome",
                "odpt:trainNumber": "2231A",
                "odpt:originStation": [
                  "odpt.Station:Toei.Oedo.Hikarigaoka"
                ],
                "odpt:railDirection": "odpt.RailDirection:InnerLoop",
                "odpt:destinationStation": [
                  "odpt.Station:Toei.Oedo.Tochomae"
                ]
              },
              {
                "@id": "urn:uuid:42631546-7b10-413b-a8e6-a17862c9b871",
                "@type": "odpt:Train",
                "dc:date": "2023-11-23T23:44:26+09:00",
                "@context": "http://vocab.odpt.org/context_odpt.jsonld",
                "dct:valid": "2023-11-23T23:45:26+09:00",
                "odpt:delay": 0,
                "owl:sameAs": "odpt.Train:Toei.Oedo.2322B",
                "odpt:railway": "odpt.Railway:Toei.Oedo",
                "odpt:operator": "odpt.Operator:Toei",
                "odpt:toStation": null,
                "odpt:trainType": "odpt.TrainType:Toei.Local",
                "odpt:fromStation": "odpt.Station:Toei.Oedo.KiyosumiShirakawa",
                "odpt:trainNumber": "2322B",
                "odpt:originStation": [
                  "odpt.Station:Toei.Oedo.Tochomae"
                ],
                "odpt:railDirection": "odpt.RailDirection:OuterLoop",
                "odpt:destinationStation": [
                  "odpt.Station:Toei.Oedo.Hikarigaoka"
                ]
              },
              {
                "@id": "urn:uuid:819f7409-f127-4909-9a83-d119b089dd3a",
                "@type": "odpt:Train",
                "dc:date": "2023-11-23T23:44:26+09:00",
                "@context": "http://vocab.odpt.org/context_odpt.jsonld",
                "dct:valid": "2023-11-23T23:45:26+09:00",
                "odpt:delay": 0,
                "owl:sameAs": "odpt.Train:Toei.Oedo.2201A",
                "odpt:railway": "odpt.Railway:Toei.Oedo",
                "odpt:operator": "odpt.Operator:Toei",
                "odpt:toStation": null,
                "odpt:trainType": "odpt.TrainType:Toei.Local",
                "odpt:fromStation": "odpt.Station:Toei.Oedo.MonzenNakacho",
                "odpt:trainNumber": "2201A",
                "odpt:originStation": [
                  "odpt.Station:Toei.Oedo.Hikarigaoka"
                ],
                "odpt:railDirection": "odpt.RailDirection:InnerLoop",
                "odpt:destinationStation": [
                  "odpt.Station:Toei.Oedo.KiyosumiShirakawa"
                ]
              },
              {
                "@id": "urn:uuid:666bc79b-adf6-4728-afbb-88157ee01f13",
                "@type": "odpt:Train",
                "dc:date": "2023-11-23T23:44:26+09:00",
                "@context": "http://vocab.odpt.org/context_odpt.jsonld",
                "dct:valid": "2023-11-23T23:45:26+09:00",
                "odpt:delay": 0,
                "owl:sameAs": "odpt.Train:Toei.Oedo.2306A",
                "odpt:railway": "odpt.Railway:Toei.Oedo",
                "odpt:operator": "odpt.Operator:Toei",
                "odpt:toStation": null,
                "odpt:trainType": "odpt.TrainType:Toei.Local",
                "odpt:fromStation": "odpt.Station:Toei.Oedo.Tochomae",
                "odpt:trainNumber": "2306A",
                "odpt:originStation": [
                  "odpt.Station:Toei.Oedo.Hikarigaoka"
                ],
                "odpt:railDirection": "odpt.RailDirection:InnerLoop",
                "odpt:destinationStation": [
                  "odpt.Station:Toei.Oedo.KiyosumiShirakawa"
                ]
              },
              {
                "@id": "urn:uuid:8af8e44a-8efe-40e2-bc3a-53f6d7707989",
                "@type": "odpt:Train",
                "dc:date": "2023-11-23T23:44:26+09:00",
                "@context": "http://vocab.odpt.org/context_odpt.jsonld",
                "dct:valid": "2023-11-23T23:45:26+09:00",
                "odpt:delay": 0,
                "owl:sameAs": "odpt.Train:Toei.Oedo.2308A",
                "odpt:railway": "odpt.Railway:Toei.Oedo",
                "odpt:operator": "odpt.Operator:Toei",
                "odpt:toStation": "odpt.Station:Toei.Oedo.ShinEgota",
                "odpt:trainType": "odpt.TrainType:Toei.Local",
                "odpt:fromStation": "odpt.Station:Toei.Oedo.Nerima",
                "odpt:trainNumber": "2308A",
                "odpt:originStation": [
                  "odpt.Station:Toei.Oedo.Hikarigaoka"
                ],
                "odpt:railDirection": "odpt.RailDirection:InnerLoop",
                "odpt:destinationStation": [
                  "odpt.Station:Toei.Oedo.KiyosumiShirakawa"
                ]
              },
              {
                "@id": "urn:uuid:770c4f51-40de-46e4-9bca-4bf0101e825d",
                "@type": "odpt:Train",
                "dc:date": "2023-11-23T23:44:26+09:00",
                "@context": "http://vocab.odpt.org/context_odpt.jsonld",
                "dct:valid": "2023-11-23T23:45:26+09:00",
                "odpt:delay": 0,
                "owl:sameAs": "odpt.Train:Toei.Oedo.2218B",
                "odpt:railway": "odpt.Railway:Toei.Oedo",
                "odpt:operator": "odpt.Operator:Toei",
                "odpt:toStation": "odpt.Station:Toei.Oedo.AoyamaItchome",
                "odpt:trainType": "odpt.TrainType:Toei.Local",
                "odpt:fromStation": "odpt.Station:Toei.Oedo.Roppongi",
                "odpt:trainNumber": "2218B",
                "odpt:originStation": [
                  "odpt.Station:Toei.Oedo.Tochomae"
                ],
                "odpt:railDirection": "odpt.RailDirection:OuterLoop",
                "odpt:destinationStation": [
                  "odpt.Station:Toei.Oedo.Hikarigaoka"
                ]
              },
              {
                "@id": "urn:uuid:86670d30-4a56-44e2-acd0-4c0f8fc79bdc",
                "@type": "odpt:Train",
                "dc:date": "2023-11-23T23:44:26+09:00",
                "@context": "http://vocab.odpt.org/context_odpt.jsonld",
                "dct:valid": "2023-11-23T23:45:26+09:00",
                "odpt:delay": 0,
                "owl:sameAs": "odpt.Train:Toei.Oedo.2303A",
                "odpt:railway": "odpt.Railway:Toei.Oedo",
                "odpt:operator": "odpt.Operator:Toei",
                "odpt:toStation": null,
                "odpt:trainType": "odpt.TrainType:Toei.Local",
                "odpt:fromStation": "odpt.Station:Toei.Oedo.Roppongi",
                "odpt:trainNumber": "2303A",
                "odpt:originStation": [
                  "odpt.Station:Toei.Oedo.Hikarigaoka"
                ],
                "odpt:railDirection": "odpt.RailDirection:InnerLoop",
                "odpt:destinationStation": [
                  "odpt.Station:Toei.Oedo.ShinOkachimachi"
                ]
              },
              {
                "@id": "urn:uuid:bcf99390-888b-4f84-96b0-07d312d69dc0",
                "@type": "odpt:Train",
                "dc:date": "2023-11-23T23:44:26+09:00",
                "@context": "http://vocab.odpt.org/context_odpt.jsonld",
                "dct:valid": "2023-11-23T23:45:26+09:00",
                "odpt:delay": 0,
                "owl:sameAs": "odpt.Train:Toei.Oedo.2217B",
                "odpt:railway": "odpt.Railway:Toei.Oedo",
                "odpt:operator": "odpt.Operator:Toei",
                "odpt:toStation": null,
                "odpt:trainType": "odpt.TrainType:Toei.Local",
                "odpt:fromStation": "odpt.Station:Toei.Oedo.Shinjuku",
                "odpt:trainNumber": "2217B",
                "odpt:originStation": [
                  "odpt.Station:Toei.Oedo.Tochomae"
                ],
                "odpt:railDirection": "odpt.RailDirection:OuterLoop",
                "odpt:destinationStation": [
                  "odpt.Station:Toei.Oedo.Hikarigaoka"
                ]
              },
              {
                "@id": "urn:uuid:89dae281-4e6e-43b3-b7a2-b01ac312731d",
                "@type": "odpt:Train",
                "dc:date": "2023-11-23T23:44:26+09:00",
                "@context": "http://vocab.odpt.org/context_odpt.jsonld",
                "dct:valid": "2023-11-23T23:45:26+09:00",
                "odpt:delay": 0,
                "owl:sameAs": "odpt.Train:Toei.Oedo.2326B",
                "odpt:railway": "odpt.Railway:Toei.Oedo",
                "odpt:operator": "odpt.Operator:Toei",
                "odpt:toStation": null,
                "odpt:trainType": "odpt.TrainType:Toei.Local",
                "odpt:fromStation": "odpt.Station:Toei.Oedo.Tochomae",
                "odpt:trainNumber": "2326B",
                "odpt:originStation": [
                  "odpt.Station:Toei.Oedo.Tochomae"
                ],
                "odpt:railDirection": "odpt.RailDirection:OuterLoop",
                "odpt:destinationStation": [
                  "odpt.Station:Toei.Oedo.Tochomae"
                ]
              },
              {
                "@id": "urn:uuid:aaaa35e2-5e26-4b3a-87d8-4505b333625b",
                "@type": "odpt:Train",
                "dc:date": "2023-11-23T23:44:26+09:00",
                "@context": "http://vocab.odpt.org/context_odpt.jsonld",
                "dct:valid": "2023-11-23T23:45:26+09:00",
                "odpt:delay": 0,
                "owl:sameAs": "odpt.Train:Toei.Oedo.2319B",
                "odpt:railway": "odpt.Railway:Toei.Oedo",
                "odpt:operator": "odpt.Operator:Toei",
                "odpt:toStation": null,
                "odpt:trainType": "odpt.TrainType:Toei.Local",
                "odpt:fromStation": "odpt.Station:Toei.Oedo.Shiodome",
                "odpt:trainNumber": "2319B",
                "odpt:originStation": [
                  "odpt.Station:Toei.Oedo.Tochomae"
                ],
                "odpt:railDirection": "odpt.RailDirection:OuterLoop",
                "odpt:destinationStation": [
                  "odpt.Station:Toei.Oedo.Hikarigaoka"
                ]
              },
              {
                "@id": "urn:uuid:033e3326-d734-44f7-96c6-2c4d799c5b16",
                "@type": "odpt:Train",
                "dc:date": "2023-11-23T23:44:26+09:00",
                "@context": "http://vocab.odpt.org/context_odpt.jsonld",
                "dct:valid": "2023-11-23T23:45:26+09:00",
                "odpt:delay": 0,
                "owl:sameAs": "odpt.Train:Toei.Oedo.2311A",
                "odpt:railway": "odpt.Railway:Toei.Oedo",
                "odpt:operator": "odpt.Operator:Toei",
                "odpt:toStation": null,
                "odpt:trainType": "odpt.TrainType:Toei.Local",
                "odpt:fromStation": "odpt.Station:Toei.Oedo.Hikarigaoka",
                "odpt:trainNumber": "2311A",
                "odpt:originStation": [
                  "odpt.Station:Toei.Oedo.Hikarigaoka"
                ],
                "odpt:railDirection": "odpt.RailDirection:InnerLoop",
                "odpt:destinationStation": [
                  "odpt.Station:Toei.Oedo.KiyosumiShirakawa"
                ]
              },
              {
                "@id": "urn:uuid:d822d074-8192-4b18-8429-a060ad6cdb85",
                "@type": "odpt:Train",
                "dc:date": "2023-11-23T23:44:26+09:00",
                "@context": "http://vocab.odpt.org/context_odpt.jsonld",
                "dct:valid": "2023-11-23T23:45:26+09:00",
                "odpt:delay": 0,
                "owl:sameAs": "odpt.Train:Toei.Oedo.2232A",
                "odpt:railway": "odpt.Railway:Toei.Oedo",
                "odpt:operator": "odpt.Operator:Toei",
                "odpt:toStation": null,
                "odpt:trainType": "odpt.TrainType:Toei.Local",
                "odpt:fromStation": "odpt.Station:Toei.Oedo.Morishita",
                "odpt:trainNumber": "2232A",
                "odpt:originStation": [
                  "odpt.Station:Toei.Oedo.Hikarigaoka"
                ],
                "odpt:railDirection": "odpt.RailDirection:InnerLoop",
                "odpt:destinationStation": [
                  "odpt.Station:Toei.Oedo.Tochomae"
                ]
              },
              {
                "@id": "urn:uuid:20c02330-ae22-40ab-869e-ea3ee97f099f",
                "@type": "odpt:Train",
                "dc:date": "2023-11-23T23:44:26+09:00",
                "@context": "http://vocab.odpt.org/context_odpt.jsonld",
                "dct:valid": "2023-11-23T23:45:26+09:00",
                "odpt:delay": 0,
                "owl:sameAs": "odpt.Train:Toei.Oedo.2325B",
                "odpt:railway": "odpt.Railway:Toei.Oedo",
                "odpt:operator": "odpt.Operator:Toei",
                "odpt:toStation": "odpt.Station:Toei.Oedo.Iidabashi",
                "odpt:trainType": "odpt.TrainType:Toei.Local",
                "odpt:fromStation": "odpt.Station:Toei.Oedo.UshigomeKagurazaka",
                "odpt:trainNumber": "2325B",
                "odpt:originStation": [
                  "odpt.Station:Toei.Oedo.Tochomae"
                ],
                "odpt:railDirection": "odpt.RailDirection:OuterLoop",
                "odpt:destinationStation": [
                  "odpt.Station:Toei.Oedo.Hikarigaoka"
                ]
              },
              {
                "@id": "urn:uuid:684aada7-6f3e-433b-9b8d-b529f954211d",
                "@type": "odpt:Train",
                "dc:date": "2023-11-23T23:44:26+09:00",
                "@context": "http://vocab.odpt.org/context_odpt.jsonld",
                "dct:valid": "2023-11-23T23:45:26+09:00",
                "odpt:delay": 0,
                "owl:sameAs": "odpt.Train:Toei.Oedo.2215B",
                "odpt:railway": "odpt.Railway:Toei.Oedo",
                "odpt:operator": "odpt.Operator:Toei",
                "odpt:toStation": null,
                "odpt:trainType": "odpt.TrainType:Toei.Local",
                "odpt:fromStation": "odpt.Station:Toei.Oedo.ShinEgota",
                "odpt:trainNumber": "2215B",
                "odpt:originStation": [
                  "odpt.Station:Toei.Oedo.Tochomae"
                ],
                "odpt:railDirection": "odpt.RailDirection:OuterLoop",
                "odpt:destinationStation": [
                  "odpt.Station:Toei.Oedo.Hikarigaoka"
                ]
              },
              {
                "@id": "urn:uuid:16f62b27-4b18-4d29-90d8-77e113324815",
                "@type": "odpt:Train",
                "dc:date": "2023-11-23T23:44:26+09:00",
                "@context": "http://vocab.odpt.org/context_odpt.jsonld",
                "dct:valid": "2023-11-23T23:45:26+09:00",
                "odpt:delay": 0,
                "owl:sameAs": "odpt.Train:Toei.Oedo.2302A",
                "odpt:railway": "odpt.Railway:Toei.Oedo",
                "odpt:operator": "odpt.Operator:Toei",
                "odpt:toStation": null,
                "odpt:trainType": "odpt.TrainType:Toei.Local",
                "odpt:fromStation": "odpt.Station:Toei.Oedo.Shiodome",
                "odpt:trainNumber": "2302A",
                "odpt:originStation": [
                  "odpt.Station:Toei.Oedo.Hikarigaoka"
                ],
                "odpt:railDirection": "odpt.RailDirection:InnerLoop",
                "odpt:destinationStation": [
                  "odpt.Station:Toei.Oedo.Tochomae"
                ]
              }
            ]
            """.trimIndent()

    private val railDirectionJson = """
            [
              {
                "@id": "urn:ucode:_00001C000000000000010000030E6C63",
                "@type": "odpt:RailDirection",
                "dc:date": "2022-02-24T08:00:00+09:00",
                "@context": "http://vocab.odpt.org/context_odpt.jsonld",
                "dc:title": "赤羽岩淵方面",
                "owl:sameAs": "odpt.RailDirection:TokyoMetro.AkabaneIwabuchi",
                "odpt:operator": "odpt.Operator:TokyoMetro",
                "odpt:railDirectionTitle": {
                  "en": "For Akabane-Iwabuchi",
                  "ja": "赤羽岩淵方面"
                }
              },
              {
                "@id": "urn:ucode:_00001C000000000000010000030E6C54",
                "@type": "odpt:RailDirection",
                "dc:date": "2022-02-24T08:00:00+09:00",
                "@context": "http://vocab.odpt.org/context_odpt.jsonld",
                "dc:title": "浅草方面",
                "owl:sameAs": "odpt.RailDirection:TokyoMetro.Asakusa",
                "odpt:operator": "odpt.Operator:TokyoMetro",
                "odpt:railDirectionTitle": {
                  "en": "For Asakusa",
                  "ja": "浅草方面"
                }
              },
              {
                "@id": "urn:ucode:_00001C000000000000010000030E6C67",
                "@type": "odpt:RailDirection",
                "dc:date": "2022-02-24T08:00:00+09:00",
                "@context": "http://vocab.odpt.org/context_odpt.jsonld",
                "dc:title": "方南町方面",
                "owl:sameAs": "odpt.RailDirection:TokyoMetro.Honancho",
                "odpt:operator": "odpt.Operator:TokyoMetro",
                "odpt:railDirectionTitle": {
                  "en": "For Honancho",
                  "ja": "方南町方面"
                }
              },
              {
                "@id": "urn:ucode:_00001C000000000000010000030E6C5A",
                "@type": "odpt:RailDirection",
                "dc:date": "2022-02-24T08:00:00+09:00",
                "@context": "http://vocab.odpt.org/context_odpt.jsonld",
                "dc:title": "池袋方面",
                "owl:sameAs": "odpt.RailDirection:TokyoMetro.Ikebukuro",
                "odpt:operator": "odpt.Operator:TokyoMetro",
                "odpt:railDirectionTitle": {
                  "en": "For Ikebukuro",
                  "ja": "池袋方面"
                }
              },
              {
                "@id": "urn:ucode:_00001C000000000000010000030E6C61",
                "@type": "odpt:RailDirection",
                "dc:date": "2022-02-24T08:00:00+09:00",
                "@context": "http://vocab.odpt.org/context_odpt.jsonld",
                "dc:title": "北綾瀬方面",
                "owl:sameAs": "odpt.RailDirection:TokyoMetro.KitaAyase",
                "odpt:operator": "odpt.Operator:TokyoMetro",
                "odpt:railDirectionTitle": {
                  "en": "For Kita-Ayase",
                  "ja": "北綾瀬方面"
                }
              },
              {
                "@id": "urn:ucode:_00001C000000000000010000030E6C5E",
                "@type": "odpt:RailDirection",
                "dc:date": "2022-02-24T08:00:00+09:00",
                "@context": "http://vocab.odpt.org/context_odpt.jsonld",
                "dc:title": "北千住方面",
                "owl:sameAs": "odpt.RailDirection:TokyoMetro.KitaSenju",
                "odpt:operator": "odpt.Operator:TokyoMetro",
                "odpt:railDirectionTitle": {
                  "en": "For Kita-Senju",
                  "ja": "北千住方面"
                }
              },
              {
                "@id": "urn:ucode:_00001C000000000000010000030E6C64",
                "@type": "odpt:RailDirection",
                "dc:date": "2022-02-24T08:00:00+09:00",
                "@context": "http://vocab.odpt.org/context_odpt.jsonld",
                "dc:title": "目黒方面",
                "owl:sameAs": "odpt.RailDirection:TokyoMetro.Meguro",
                "odpt:operator": "odpt.Operator:TokyoMetro",
                "odpt:railDirectionTitle": {
                  "en": "For Meguro",
                  "ja": "目黒方面"
                }
              },
              {
                "@id": "urn:ucode:_00001C000000000000010000030E6C56",
                "@type": "odpt:RailDirection",
                "dc:date": "2022-02-24T08:00:00+09:00",
                "@context": "http://vocab.odpt.org/context_odpt.jsonld",
                "dc:title": "中目黒方面",
                "owl:sameAs": "odpt.RailDirection:TokyoMetro.NakaMeguro",
                "odpt:operator": "odpt.Operator:TokyoMetro",
                "odpt:railDirectionTitle": {
                  "en": "For Naka-Meguro",
                  "ja": "中目黒方面"
                }
              },
              {
                "@id": "urn:ucode:_00001C000000000000010000030E6C55",
                "@type": "odpt:RailDirection",
                "dc:date": "2022-02-24T08:00:00+09:00",
                "@context": "http://vocab.odpt.org/context_odpt.jsonld",
                "dc:title": "中野坂上方面",
                "owl:sameAs": "odpt.RailDirection:TokyoMetro.NakanoSakaue",
                "odpt:operator": "odpt.Operator:TokyoMetro",
                "odpt:railDirectionTitle": {
                  "en": "For Nakano-Sakaue",
                  "ja": "中野坂上方面"
                }
              },
              {
                "@id": "urn:ucode:_00001C000000000000010000030E6C57",
                "@type": "odpt:RailDirection",
                "dc:date": "2022-02-24T08:00:00+09:00",
                "@context": "http://vocab.odpt.org/context_odpt.jsonld",
                "dc:title": "中野方面",
                "owl:sameAs": "odpt.RailDirection:TokyoMetro.Nakano",
                "odpt:operator": "odpt.Operator:TokyoMetro",
                "odpt:railDirectionTitle": {
                  "en": "For Nakano",
                  "ja": "中野方面"
                }
              },
              {
                "@id": "urn:ucode:_00001C000000000000010000030E6C5F",
                "@type": "odpt:RailDirection",
                "dc:date": "2022-02-24T08:00:00+09:00",
                "@context": "http://vocab.odpt.org/context_odpt.jsonld",
                "dc:title": "西船橋方面",
                "owl:sameAs": "odpt.RailDirection:TokyoMetro.NishiFunabashi",
                "odpt:operator": "odpt.Operator:TokyoMetro",
                "odpt:railDirectionTitle": {
                  "en": "For Nishi-Funabashi",
                  "ja": "西船橋方面"
                }
              },
              {
                "@id": "urn:ucode:_00001C000000000000010000030E6C5C",
                "@type": "odpt:RailDirection",
                "dc:date": "2022-02-24T08:00:00+09:00",
                "@context": "http://vocab.odpt.org/context_odpt.jsonld",
                "dc:title": "荻窪方面",
                "owl:sameAs": "odpt.RailDirection:TokyoMetro.Ogikubo",
                "odpt:operator": "odpt.Operator:TokyoMetro",
                "odpt:railDirectionTitle": {
                  "en": "For Ogikubo",
                  "ja": "荻窪方面"
                }
              },
              {
                "@id": "urn:ucode:_00001C000000000000010000030E6C62",
                "@type": "odpt:RailDirection",
                "dc:date": "2022-02-24T08:00:00+09:00",
                "@context": "http://vocab.odpt.org/context_odpt.jsonld",
                "dc:title": "押上方面",
                "owl:sameAs": "odpt.RailDirection:TokyoMetro.Oshiage",
                "odpt:operator": "odpt.Operator:TokyoMetro",
                "odpt:railDirectionTitle": {
                  "en": "For Oshiage",
                  "ja": "押上方面"
                }
              },
              {
                "@id": "urn:ucode:_00001C000000000000010000030E6C5B",
                "@type": "odpt:RailDirection",
                "dc:date": "2022-02-24T08:00:00+09:00",
                "@context": "http://vocab.odpt.org/context_odpt.jsonld",
                "dc:title": "渋谷方面",
                "owl:sameAs": "odpt.RailDirection:TokyoMetro.Shibuya",
                "odpt:operator": "odpt.Operator:TokyoMetro",
                "odpt:railDirectionTitle": {
                  "en": "For Shibuya",
                  "ja": "渋谷方面"
                }
              },
              {
                "@id": "urn:ucode:_00001C000000000000010000030E6C59",
                "@type": "odpt:RailDirection",
                "dc:date": "2022-02-24T08:00:00+09:00",
                "@context": "http://vocab.odpt.org/context_odpt.jsonld",
                "dc:title": "新木場方面",
                "owl:sameAs": "odpt.RailDirection:TokyoMetro.ShinKiba",
                "odpt:operator": "odpt.Operator:TokyoMetro",
                "odpt:railDirectionTitle": {
                  "en": "For Shin-Kiba",
                  "ja": "新木場方面"
                }
              },
              {
                "@id": "urn:ucode:_00001C000000000000010000030E6C66",
                "@type": "odpt:RailDirection",
                "dc:date": "2022-02-24T08:00:00+09:00",
                "@context": "http://vocab.odpt.org/context_odpt.jsonld",
                "dc:title": "和光市方面",
                "owl:sameAs": "odpt.RailDirection:TokyoMetro.Wakoshi",
                "odpt:operator": "odpt.Operator:TokyoMetro",
                "odpt:railDirectionTitle": {
                  "en": "For Wakoshi",
                  "ja": "和光市方面"
                }
              },
              {
                "@id": "urn:ucode:_00001C000000000000010000030E6C60",
                "@type": "odpt:RailDirection",
                "dc:date": "2022-02-24T08:00:00+09:00",
                "@context": "http://vocab.odpt.org/context_odpt.jsonld",
                "dc:title": "代々木上原方面",
                "owl:sameAs": "odpt.RailDirection:TokyoMetro.YoyogiUehara",
                "odpt:operator": "odpt.Operator:TokyoMetro",
                "odpt:railDirectionTitle": {
                  "en": "For Yoyogi-Uehara",
                  "ja": "代々木上原方面"
                }
              },
              {
                "@id": "urn:ucode:_00001C0000000000000100000320030B",
                "@type": "odpt:RailDirection",
                "dc:date": "2019-04-25T14:00:00+09:00",
                "@context": "http://vocab.odpt.org/context_odpt.jsonld",
                "dc:title": "上り",
                "owl:sameAs": "odpt.RailDirection:Inbound",
                "odpt:railDirectionTitle": {
                  "en": "Inbound",
                  "ja": "上り"
                }
              },
              {
                "@id": "urn:ucode:_00001C0000000000000100000320030C",
                "@type": "odpt:RailDirection",
                "dc:date": "2019-04-25T14:00:00+09:00",
                "@context": "http://vocab.odpt.org/context_odpt.jsonld",
                "dc:title": "内回り",
                "owl:sameAs": "odpt.RailDirection:InnerLoop",
                "odpt:railDirectionTitle": {
                  "en": "Inner Loop",
                  "ja": "内回り"
                }
              },
              {
                "@id": "urn:ucode:_00001C0000000000000100000320030D",
                "@type": "odpt:RailDirection",
                "dc:date": "2019-04-25T14:00:00+09:00",
                "@context": "http://vocab.odpt.org/context_odpt.jsonld",
                "dc:title": "下り",
                "owl:sameAs": "odpt.RailDirection:Outbound",
                "odpt:railDirectionTitle": {
                  "en": "Outbound",
                  "ja": "下り"
                }
              },
              {
                "@id": "urn:ucode:_00001C0000000000000100000320030E",
                "@type": "odpt:RailDirection",
                "dc:date": "2019-04-25T14:00:00+09:00",
                "@context": "http://vocab.odpt.org/context_odpt.jsonld",
                "dc:title": "外回り",
                "owl:sameAs": "odpt.RailDirection:OuterLoop",
                "odpt:railDirectionTitle": {
                  "en": "Outer Loop",
                  "ja": "外回り"
                }
              },
              {
                "@id": "urn:ucode:_00001C0000000000000100000320960C",
                "@type": "odpt:RailDirection",
                "dc:date": "2019-04-25T14:00:00+09:00",
                "@context": "http://vocab.odpt.org/context_odpt.jsonld",
                "dc:title": "東行",
                "owl:sameAs": "odpt.RailDirection:Eastbound",
                "odpt:railDirectionTitle": {
                  "en": "Eastbound",
                  "ja": "東行"
                }
              },
              {
                "@id": "urn:ucode:_00001C0000000000000100000320960D",
                "@type": "odpt:RailDirection",
                "dc:date": "2019-04-25T14:00:00+09:00",
                "@context": "http://vocab.odpt.org/context_odpt.jsonld",
                "dc:title": "北行",
                "owl:sameAs": "odpt.RailDirection:Northbound",
                "odpt:railDirectionTitle": {
                  "en": "Northbound",
                  "ja": "北行"
                }
              },
              {
                "@id": "urn:ucode:_00001C0000000000000100000320960E",
                "@type": "odpt:RailDirection",
                "dc:date": "2019-04-25T14:00:00+09:00",
                "@context": "http://vocab.odpt.org/context_odpt.jsonld",
                "dc:title": "南行",
                "owl:sameAs": "odpt.RailDirection:Southbound",
                "odpt:railDirectionTitle": {
                  "en": "Southbound",
                  "ja": "南行"
                }
              },
              {
                "@id": "urn:ucode:_00001C0000000000000100000320960F",
                "@type": "odpt:RailDirection",
                "dc:date": "2019-04-25T14:00:00+09:00",
                "@context": "http://vocab.odpt.org/context_odpt.jsonld",
                "dc:title": "西行",
                "owl:sameAs": "odpt.RailDirection:Westbound",
                "odpt:railDirectionTitle": {
                  "en": "Westbound",
                  "ja": "西行"
                }
              },
              {
                "@id": "urn:ucode:_00001C0000000000000100000323076F",
                "@type": "odpt:RailDirection",
                "dc:date": "2019-04-25T14:00:00+09:00",
                "@context": "http://vocab.odpt.org/context_odpt.jsonld",
                "dc:title": "光が丘方面",
                "owl:sameAs": "odpt.RailDirection:Toei.Hikarigaoka",
                "odpt:operator": "odpt.Operator:Toei",
                "odpt:railDirectionTitle": {
                  "en": "For Hikarigaoka",
                  "ja": "光が丘方面"
                }
              },
              {
                "@id": "urn:ucode:_00001C00000000000001000003230770",
                "@type": "odpt:RailDirection",
                "dc:date": "2019-04-25T14:00:00+09:00",
                "@context": "http://vocab.odpt.org/context_odpt.jsonld",
                "dc:title": "三ノ輪橋方面",
                "owl:sameAs": "odpt.RailDirection:Toei.Minowabashi",
                "odpt:operator": "odpt.Operator:Toei",
                "odpt:railDirectionTitle": {
                  "en": "For Minowabashi",
                  "ja": "三ノ輪橋方面"
                }
              },
              {
                "@id": "urn:ucode:_00001C00000000000001000003230771",
                "@type": "odpt:RailDirection",
                "dc:date": "2019-04-25T14:00:00+09:00",
                "@context": "http://vocab.odpt.org/context_odpt.jsonld",
                "dc:title": "早稲田方面",
                "owl:sameAs": "odpt.RailDirection:Toei.Waseda",
                "odpt:operator": "odpt.Operator:Toei",
                "odpt:railDirectionTitle": {
                  "en": "For Waseda",
                  "ja": "早稲田方面"
                }
              },
              {
                "@id": "urn:ucode:_00001C00000000000001000003304252",
                "@type": "odpt:RailDirection",
                "dc:date": "2019-04-25T14:00:00+09:00",
                "@context": "http://vocab.odpt.org/context_odpt.jsonld",
                "dc:title": "上下線",
                "owl:sameAs": "odpt.RailDirection:BothDirections",
                "odpt:railDirectionTitle": {
                  "en": "Both Directions",
                  "ja": "上下線"
                }
              }
            ]
        """.trimIndent()

    private val trainTypeJson = """
       [
  {
    "@id": "urn:ucode:_00001C00000000000001000003395AA3",
    "@type": "odpt:TrainType",
    "dc:date": "2020-03-03T08:00:00+09:00",
    "@context": "http://vocab.odpt.org/context_odpt.jsonld",
    "dc:title": "普通",
    "owl:sameAs": "odpt.TrainType:YokohamaMunicipal.Local",
    "odpt:operator": "odpt.Operator:YokohamaMunicipal",
    "odpt:trainTypeTitle": {
      "en": "Local",
      "ja": "普通"
    }
  },
  {
    "@id": "urn:ucode:_00001C00000000000001000003395AA4",
    "@type": "odpt:TrainType",
    "dc:date": "2020-03-03T08:00:00+09:00",
    "@context": "http://vocab.odpt.org/context_odpt.jsonld",
    "dc:title": "快速",
    "owl:sameAs": "odpt.TrainType:YokohamaMunicipal.Rapid",
    "odpt:operator": "odpt.Operator:YokohamaMunicipal",
    "odpt:trainTypeTitle": {
      "en": "Rapid",
      "ja": "快速"
    }
  },
  {
    "@id": "urn:ucode:_00001C000000000000010000032095EB",
    "@type": "odpt:TrainType",
    "dc:date": "2020-03-27T13:00:00+09:00",
    "@context": "http://vocab.odpt.org/context_odpt.jsonld",
    "dc:title": "通勤快速",
    "owl:sameAs": "odpt.TrainType:TWR.CommuterRapid",
    "odpt:operator": "odpt.Operator:TWR",
    "odpt:trainTypeTitle": {
      "en": "Commuter Rapid",
      "ja": "通勤快速"
    }
  },
  {
    "@id": "urn:ucode:_00001C000000000000010000032095EC",
    "@type": "odpt:TrainType",
    "dc:date": "2020-03-27T13:00:00+09:00",
    "@context": "http://vocab.odpt.org/context_odpt.jsonld",
    "dc:title": "普通",
    "owl:sameAs": "odpt.TrainType:TWR.Local",
    "odpt:operator": "odpt.Operator:TWR",
    "odpt:trainTypeTitle": {
      "en": "Local",
      "ja": "普通"
    }
  },
  {
    "@id": "urn:ucode:_00001C000000000000010000032095ED",
    "@type": "odpt:TrainType",
    "dc:date": "2020-03-27T13:00:00+09:00",
    "@context": "http://vocab.odpt.org/context_odpt.jsonld",
    "dc:title": "快速",
    "owl:sameAs": "odpt.TrainType:TWR.Rapid",
    "odpt:operator": "odpt.Operator:TWR",
    "odpt:trainTypeTitle": {
      "en": "Rapid",
      "ja": "快速"
    }
  },
  {
    "@id": "urn:ucode:_00001C000000000000010000032097DD",
    "@type": "odpt:TrainType",
    "dc:date": "2020-03-27T13:00:00+09:00",
    "@context": "http://vocab.odpt.org/context_odpt.jsonld",
    "dc:title": "普通",
    "owl:sameAs": "odpt.TrainType:Yurikamome.Local",
    "odpt:operator": "odpt.Operator:Yurikamome",
    "odpt:trainTypeTitle": {
      "en": "Local",
      "ja": "普通"
    }
  },
  {
    "@id": "urn:ucode:_00001C00000000000001000003465317",
    "@type": "odpt:TrainType",
    "dc:date": "2021-06-24T08:00:00+09:00",
    "@context": "http://vocab.odpt.org/context_odpt.jsonld",
    "dc:title": "通勤快速",
    "owl:sameAs": "odpt.TrainType:MIR.CommuterRapid",
    "odpt:operator": "odpt.Operator:MIR",
    "odpt:trainTypeTitle": {
      "en": "Commuter Rapid",
      "ja": "通勤快速"
    }
  },
  {
    "@id": "urn:ucode:_00001C00000000000001000003465318",
    "@type": "odpt:TrainType",
    "dc:date": "2021-06-24T08:00:00+09:00",
    "@context": "http://vocab.odpt.org/context_odpt.jsonld",
    "dc:title": "普通",
    "owl:sameAs": "odpt.TrainType:MIR.Local",
    "odpt:operator": "odpt.Operator:MIR",
    "odpt:trainTypeTitle": {
      "en": "Local",
      "ja": "普通"
    }
  },
  {
    "@id": "urn:ucode:_00001C00000000000001000003465319",
    "@type": "odpt:TrainType",
    "dc:date": "2021-06-24T08:00:00+09:00",
    "@context": "http://vocab.odpt.org/context_odpt.jsonld",
    "dc:title": "快速",
    "owl:sameAs": "odpt.TrainType:MIR.Rapid",
    "odpt:operator": "odpt.Operator:MIR",
    "odpt:trainTypeTitle": {
      "en": "Rapid",
      "ja": "快速"
    }
  },
  {
    "@id": "urn:ucode:_00001C0000000000000100000346531A",
    "@type": "odpt:TrainType",
    "dc:date": "2021-06-24T08:00:00+09:00",
    "@context": "http://vocab.odpt.org/context_odpt.jsonld",
    "dc:title": "区間快速",
    "owl:sameAs": "odpt.TrainType:MIR.SemiRapid",
    "odpt:operator": "odpt.Operator:MIR",
    "odpt:trainTypeTitle": {
      "en": "Semi Rapid",
      "ja": "区間快速"
    }
  },
  {
    "@id": "urn:ucode:_00001C0000000000000100000346585E",
    "@type": "odpt:TrainType",
    "dc:date": "2021-06-24T08:00:00+09:00",
    "@context": "http://vocab.odpt.org/context_odpt.jsonld",
    "dc:title": "普通",
    "owl:sameAs": "odpt.TrainType:TamaMonorail.Local",
    "odpt:operator": "odpt.Operator:TamaMonorail",
    "odpt:trainTypeTitle": {
      "en": "Local",
      "ja": "普通"
    }
  },
  {
    "@id": "urn:ucode:_00001C000000000000010000030E8B6E",
    "@type": "odpt:TrainType",
    "dc:date": "2022-02-24T08:00:00+09:00",
    "@context": "http://vocab.odpt.org/context_odpt.jsonld",
    "dc:title": "通勤急行",
    "owl:sameAs": "odpt.TrainType:TokyoMetro.CommuterExpress",
    "odpt:operator": "odpt.Operator:TokyoMetro",
    "odpt:trainTypeTitle": {
      "en": "Commuter Express",
      "ja": "通勤急行"
    }
  },
  {
    "@id": "urn:ucode:_00001C000000000000010000030E8B70",
    "@type": "odpt:TrainType",
    "dc:date": "2022-02-24T08:00:00+09:00",
    "@context": "http://vocab.odpt.org/context_odpt.jsonld",
    "dc:title": "通勤特急",
    "owl:sameAs": "odpt.TrainType:TokyoMetro.CommuterLimitedExpress",
    "odpt:operator": "odpt.Operator:TokyoMetro",
    "odpt:trainTypeTitle": {
      "en": "Commuter Limited Express",
      "ja": "通勤特急"
    }
  },
  {
    "@id": "urn:ucode:_00001C000000000000010000030E8B72",
    "@type": "odpt:TrainType",
    "dc:date": "2022-02-24T08:00:00+09:00",
    "@context": "http://vocab.odpt.org/context_odpt.jsonld",
    "dc:title": "通勤快速",
    "owl:sameAs": "odpt.TrainType:TokyoMetro.CommuterRapid",
    "odpt:operator": "odpt.Operator:TokyoMetro",
    "odpt:trainTypeTitle": {
      "en": "Commuter Rapid",
      "ja": "通勤快速"
    }
  },
  {
    "@id": "urn:ucode:_00001C000000000000010000030E8B6B",
    "@type": "odpt:TrainType",
    "dc:date": "2022-02-24T08:00:00+09:00",
    "@context": "http://vocab.odpt.org/context_odpt.jsonld",
    "dc:title": "急行",
    "owl:sameAs": "odpt.TrainType:TokyoMetro.Express",
    "odpt:operator": "odpt.Operator:TokyoMetro",
    "odpt:trainTypeTitle": {
      "en": "Express",
      "ja": "急行"
    }
  },
  {
    "@id": "urn:ucode:_00001C0000000000000100000320877A",
    "@type": "odpt:TrainType",
    "dc:date": "2022-02-24T08:00:00+09:00",
    "@context": "http://vocab.odpt.org/context_odpt.jsonld",
    "dc:title": "Fライナー",
    "owl:sameAs": "odpt.TrainType:TokyoMetro.F-Liner",
    "odpt:operator": "odpt.Operator:TokyoMetro",
    "odpt:trainTypeTitle": {
      "en": "F-Liner",
      "ja": "Fライナー"
    }
  },
  {
    "@id": "urn:ucode:_00001C000000000000010000030E8B6F",
    "@type": "odpt:TrainType",
    "dc:date": "2022-02-24T08:00:00+09:00",
    "@context": "http://vocab.odpt.org/context_odpt.jsonld",
    "dc:title": "特急",
    "owl:sameAs": "odpt.TrainType:TokyoMetro.LimitedExpress",
    "odpt:operator": "odpt.Operator:TokyoMetro",
    "odpt:trainTypeTitle": {
      "en": "Limited Express",
      "ja": "特急"
    }
  },
  {
    "@id": "urn:ucode:_00001C000000000000010000030E8B71",
    "@type": "odpt:TrainType",
    "dc:date": "2022-02-24T08:00:00+09:00",
    "@context": "http://vocab.odpt.org/context_odpt.jsonld",
    "dc:title": "普通",
    "owl:sameAs": "odpt.TrainType:TokyoMetro.Local",
    "odpt:operator": "odpt.Operator:TokyoMetro",
    "odpt:trainTypeTitle": {
      "en": "Local",
      "ja": "普通"
    }
  },
  {
    "@id": "urn:ucode:_00001C000000000000010000030E8B6D",
    "@type": "odpt:TrainType",
    "dc:date": "2022-02-24T08:00:00+09:00",
    "@context": "http://vocab.odpt.org/context_odpt.jsonld",
    "dc:title": "快速急行",
    "owl:sameAs": "odpt.TrainType:TokyoMetro.RapidExpress",
    "odpt:operator": "odpt.Operator:TokyoMetro",
    "odpt:trainTypeTitle": {
      "en": "Rapid Express",
      "ja": "快速急行"
    }
  },
  {
    "@id": "urn:ucode:_00001C000000000000010000030E8B6C",
    "@type": "odpt:TrainType",
    "dc:date": "2022-02-24T08:00:00+09:00",
    "@context": "http://vocab.odpt.org/context_odpt.jsonld",
    "dc:title": "快速",
    "owl:sameAs": "odpt.TrainType:TokyoMetro.Rapid",
    "odpt:operator": "odpt.Operator:TokyoMetro",
    "odpt:trainTypeTitle": {
      "en": "Rapid",
      "ja": "快速"
    }
  },
  {
    "@id": "urn:ucode:_00001C0000000000000100000320877B",
    "@type": "odpt:TrainType",
    "dc:date": "2022-02-24T08:00:00+09:00",
    "@context": "http://vocab.odpt.org/context_odpt.jsonld",
    "dc:title": "Sトレイン",
    "owl:sameAs": "odpt.TrainType:TokyoMetro.S-TRAIN",
    "odpt:operator": "odpt.Operator:TokyoMetro",
    "odpt:trainTypeTitle": {
      "en": "S-TRAIN",
      "ja": "Sトレイン"
    }
  },
  {
    "@id": "urn:ucode:_00001C000000000000010000030E8B79",
    "@type": "odpt:TrainType",
    "dc:date": "2022-02-24T08:00:00+09:00",
    "@context": "http://vocab.odpt.org/context_odpt.jsonld",
    "dc:title": "準急",
    "owl:sameAs": "odpt.TrainType:TokyoMetro.SemiExpress",
    "odpt:operator": "odpt.Operator:TokyoMetro",
    "odpt:trainTypeTitle": {
      "en": "Semi Express",
      "ja": "準急"
    }
  },
  {
    "@id": "urn:ucode:_00001C000000000000010000034A133C",
    "@type": "odpt:TrainType",
    "dc:date": "2022-02-24T08:00:00+09:00",
    "@context": "http://vocab.odpt.org/context_odpt.jsonld",
    "dc:title": "THライナー",
    "owl:sameAs": "odpt.TrainType:TokyoMetro.TH-LINER",
    "odpt:operator": "odpt.Operator:TokyoMetro",
    "odpt:trainTypeTitle": {
      "en": "TH-LINER",
      "ja": "THライナー"
    }
  },
  {
    "@id": "urn:ucode:_00001C00000000000001000003230794",
    "@type": "odpt:TrainType",
    "dc:date": "2019-04-25T16:00:00+09:00",
    "@context": "http://vocab.odpt.org/context_odpt.jsonld",
    "dc:title": "アクセス特急",
    "owl:sameAs": "odpt.TrainType:Toei.AccessExpress",
    "odpt:operator": "odpt.Operator:Toei",
    "odpt:trainTypeTitle": {
      "en": "Access Express",
      "ja": "アクセス特急"
    }
  },
  {
    "@id": "urn:ucode:_00001C00000000000001000003230795",
    "@type": "odpt:TrainType",
    "dc:date": "2019-04-25T16:00:00+09:00",
    "@context": "http://vocab.odpt.org/context_odpt.jsonld",
    "dc:title": "エアポート快特",
    "owl:sameAs": "odpt.TrainType:Toei.AirportRapidLimitedExpress",
    "odpt:operator": "odpt.Operator:Toei",
    "odpt:trainTypeTitle": {
      "en": "Airport Rapid Limited Express",
      "ja": "エアポート快特"
    }
  },
  {
    "@id": "urn:ucode:_00001C00000000000001000003230796",
    "@type": "odpt:TrainType",
    "dc:date": "2019-04-25T16:00:00+09:00",
    "@context": "http://vocab.odpt.org/context_odpt.jsonld",
    "dc:title": "通勤特急",
    "owl:sameAs": "odpt.TrainType:Toei.CommuterLimitedExpress",
    "odpt:operator": "odpt.Operator:Toei",
    "odpt:trainTypeTitle": {
      "en": "Commuter Limited Express",
      "ja": "通勤特急"
    }
  },
  {
    "@id": "urn:ucode:_00001C00000000000001000003230797",
    "@type": "odpt:TrainType",
    "dc:date": "2019-04-25T16:00:00+09:00",
    "@context": "http://vocab.odpt.org/context_odpt.jsonld",
    "dc:title": "急行",
    "owl:sameAs": "odpt.TrainType:Toei.Express",
    "odpt:operator": "odpt.Operator:Toei",
    "odpt:trainTypeTitle": {
      "en": "Express",
      "ja": "急行"
    }
  },
  {
    "@id": "urn:ucode:_00001C00000000000001000003230798",
    "@type": "odpt:TrainType",
    "dc:date": "2019-04-25T16:00:00+09:00",
    "@context": "http://vocab.odpt.org/context_odpt.jsonld",
    "dc:title": "特急",
    "owl:sameAs": "odpt.TrainType:Toei.LimitedExpress",
    "odpt:operator": "odpt.Operator:Toei",
    "odpt:trainTypeTitle": {
      "en": "Limited Express",
      "ja": "特急"
    }
  },
  {
    "@id": "urn:ucode:_00001C00000000000001000003230799",
    "@type": "odpt:TrainType",
    "dc:date": "2019-04-25T16:00:00+09:00",
    "@context": "http://vocab.odpt.org/context_odpt.jsonld",
    "dc:title": "普通",
    "owl:sameAs": "odpt.TrainType:Toei.Local",
    "odpt:operator": "odpt.Operator:Toei",
    "odpt:trainTypeTitle": {
      "en": "Local",
      "ja": "普通"
    }
  },
  {
    "@id": "urn:ucode:_00001C0000000000000100000323079B",
    "@type": "odpt:TrainType",
    "dc:date": "2019-04-25T16:00:00+09:00",
    "@context": "http://vocab.odpt.org/context_odpt.jsonld",
    "dc:title": "快特",
    "owl:sameAs": "odpt.TrainType:Toei.RapidLimitedExpress",
    "odpt:operator": "odpt.Operator:Toei",
    "odpt:trainTypeTitle": {
      "en": "Rapid Limited Express",
      "ja": "快特"
    }
  },
  {
    "@id": "urn:ucode:_00001C0000000000000100000323079A",
    "@type": "odpt:TrainType",
    "dc:date": "2019-04-25T16:00:00+09:00",
    "@context": "http://vocab.odpt.org/context_odpt.jsonld",
    "dc:title": "快速",
    "owl:sameAs": "odpt.TrainType:Toei.Rapid",
    "odpt:operator": "odpt.Operator:Toei",
    "odpt:trainTypeTitle": {
      "en": "Rapid",
      "ja": "快速"
    }
  }
] 
    """.trimIndent()

    private val stationJson = """
        [
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CF1",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.750477,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "小台",
            "geo:long": 139.761739,
            "owl:sameAs": "odpt.Station:Toei.Arakawa.Odai",
            "odpt:railway": "odpt.Railway:Toei.Arakawa",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "SA-11",
            "odpt:stationTitle": {
              "en": "Odai",
              "ja": "小台"
            },
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Arakawa.Odai.Toei.Minowabashi.Weekday",
              "odpt.StationTimetable:Toei.Arakawa.Odai.Toei.Minowabashi.Saturday",
              "odpt.StationTimetable:Toei.Arakawa.Odai.Toei.Minowabashi.Holiday",
              "odpt.StationTimetable:Toei.Arakawa.Odai.Toei.Waseda.Weekday",
              "odpt.StationTimetable:Toei.Arakawa.Odai.Toei.Waseda.Saturday",
              "odpt.StationTimetable:Toei.Arakawa.Odai.Toei.Waseda.Holiday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CB6",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.688399,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "菊川",
            "geo:long": 139.806057,
            "owl:sameAs": "odpt.Station:Toei.Shinjuku.Kikukawa",
            "odpt:railway": "odpt.Railway:Toei.Shinjuku",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "S-12",
            "odpt:stationTitle": {
              "en": "Kikukawa",
              "ja": "菊川"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Kikukawa"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Shinjuku.Kikukawa.Westbound.Weekday",
              "odpt.StationTimetable:Toei.Shinjuku.Kikukawa.Westbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Shinjuku.Kikukawa.Eastbound.Weekday",
              "odpt.StationTimetable:Toei.Shinjuku.Kikukawa.Eastbound.SaturdayHoliday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102C7D",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.596773,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "馬込",
            "geo:long": 139.711884,
            "owl:sameAs": "odpt.Station:Toei.Asakusa.Magome",
            "odpt:railway": "odpt.Railway:Toei.Asakusa",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "A-02",
            "odpt:stationTitle": {
              "en": "Magome",
              "ja": "馬込"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Magome"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Asakusa.Magome.Southbound.Weekday",
              "odpt.StationTimetable:Toei.Asakusa.Magome.Southbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Asakusa.Magome.Northbound.Weekday",
              "odpt.StationTimetable:Toei.Asakusa.Magome.Northbound.SaturdayHoliday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CE6",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.758527,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "光が丘",
            "geo:long": 139.628901,
            "owl:sameAs": "odpt.Station:Toei.Oedo.Hikarigaoka",
            "odpt:railway": "odpt.Railway:Toei.Oedo",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "E-38",
            "odpt:stationTitle": {
              "en": "Hikarigaoka",
              "ja": "光が丘"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Hikarigaoka"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Oedo.Hikarigaoka.InnerLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.Hikarigaoka.InnerLoop.SaturdayHoliday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102D04",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.71176,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "早稲田",
            "geo:long": 139.719003,
            "owl:sameAs": "odpt.Station:Toei.Arakawa.Waseda",
            "odpt:railway": "odpt.Railway:Toei.Arakawa",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "SA-30",
            "odpt:stationTitle": {
              "en": "Waseda",
              "ja": "早稲田"
            },
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Arakawa.Waseda.Toei.Minowabashi.Weekday",
              "odpt.StationTimetable:Toei.Arakawa.Waseda.Toei.Minowabashi.Saturday",
              "odpt.StationTimetable:Toei.Arakawa.Waseda.Toei.Minowabashi.Holiday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CE7",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.732207,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "三ノ輪橋",
            "geo:long": 139.791509,
            "owl:sameAs": "odpt.Station:Toei.Arakawa.Minowabashi",
            "odpt:railway": "odpt.Railway:Toei.Arakawa",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "SA-01",
            "odpt:stationTitle": {
              "en": "Minowabashi",
              "ja": "三ノ輪橋"
            },
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Arakawa.Minowabashi.Toei.Waseda.Weekday",
              "odpt.StationTimetable:Toei.Arakawa.Minowabashi.Toei.Waseda.Saturday",
              "odpt.StationTimetable:Toei.Arakawa.Minowabashi.Toei.Waseda.Holiday"
            ],
            "odpt:connectingRailway": [
              "odpt.Railway:TokyoMetro.Hibiya"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102C7F",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.614421,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "戸越",
            "geo:long": 139.716315,
            "owl:sameAs": "odpt.Station:Toei.Asakusa.Togoshi",
            "odpt:railway": "odpt.Railway:Toei.Asakusa",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "A-04",
            "odpt:stationTitle": {
              "en": "Togoshi",
              "ja": "戸越"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Togoshi"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Asakusa.Togoshi.Southbound.Weekday",
              "odpt.StationTimetable:Toei.Asakusa.Togoshi.Southbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Asakusa.Togoshi.Northbound.Weekday",
              "odpt.StationTimetable:Toei.Asakusa.Togoshi.Northbound.SaturdayHoliday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CE8",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.733768,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "荒川一中前",
            "geo:long": 139.788841,
            "owl:sameAs": "odpt.Station:Toei.Arakawa.ArakawaItchumae",
            "odpt:railway": "odpt.Railway:Toei.Arakawa",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "SA-02",
            "odpt:stationTitle": {
              "en": "Arakawa-itchumae",
              "ja": "荒川一中前"
            },
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Arakawa.ArakawaItchumae.Toei.Minowabashi.Weekday",
              "odpt.StationTimetable:Toei.Arakawa.ArakawaItchumae.Toei.Minowabashi.Saturday",
              "odpt.StationTimetable:Toei.Arakawa.ArakawaItchumae.Toei.Minowabashi.Holiday",
              "odpt.StationTimetable:Toei.Arakawa.ArakawaItchumae.Toei.Waseda.Weekday",
              "odpt.StationTimetable:Toei.Arakawa.ArakawaItchumae.Toei.Waseda.Saturday",
              "odpt.StationTimetable:Toei.Arakawa.ArakawaItchumae.Toei.Waseda.Holiday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CEB",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.741923,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "荒川七丁目",
            "geo:long": 139.78421,
            "owl:sameAs": "odpt.Station:Toei.Arakawa.ArakawaNanachome",
            "odpt:railway": "odpt.Railway:Toei.Arakawa",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "SA-05",
            "odpt:stationTitle": {
              "en": "Arakawa-nanachome",
              "ja": "荒川七丁目"
            },
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Arakawa.ArakawaNanachome.Toei.Minowabashi.Weekday",
              "odpt.StationTimetable:Toei.Arakawa.ArakawaNanachome.Toei.Minowabashi.Saturday",
              "odpt.StationTimetable:Toei.Arakawa.ArakawaNanachome.Toei.Minowabashi.Holiday",
              "odpt.StationTimetable:Toei.Arakawa.ArakawaNanachome.Toei.Waseda.Weekday",
              "odpt.StationTimetable:Toei.Arakawa.ArakawaNanachome.Toei.Waseda.Saturday",
              "odpt.StationTimetable:Toei.Arakawa.ArakawaNanachome.Toei.Waseda.Holiday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CEA",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.738573,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "荒川二丁目",
            "geo:long": 139.784704,
            "owl:sameAs": "odpt.Station:Toei.Arakawa.ArakawaNichome",
            "odpt:railway": "odpt.Railway:Toei.Arakawa",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "SA-04",
            "odpt:stationTitle": {
              "en": "Arakawa-nichome",
              "ja": "荒川二丁目"
            },
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Arakawa.ArakawaNichome.Toei.Minowabashi.Weekday",
              "odpt.StationTimetable:Toei.Arakawa.ArakawaNichome.Toei.Minowabashi.Saturday",
              "odpt.StationTimetable:Toei.Arakawa.ArakawaNichome.Toei.Minowabashi.Holiday",
              "odpt.StationTimetable:Toei.Arakawa.ArakawaNichome.Toei.Waseda.Weekday",
              "odpt.StationTimetable:Toei.Arakawa.ArakawaNichome.Toei.Waseda.Saturday",
              "odpt.StationTimetable:Toei.Arakawa.ArakawaNichome.Toei.Waseda.Holiday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CF3",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.750865,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "荒川車庫前",
            "geo:long": 139.752461,
            "owl:sameAs": "odpt.Station:Toei.Arakawa.ArakawaShakomae",
            "odpt:railway": "odpt.Railway:Toei.Arakawa",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "SA-13",
            "odpt:stationTitle": {
              "en": "Arakawa-shakomae",
              "ja": "荒川車庫前"
            },
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Arakawa.ArakawaShakomae.Toei.Minowabashi.Weekday",
              "odpt.StationTimetable:Toei.Arakawa.ArakawaShakomae.Toei.Minowabashi.Saturday",
              "odpt.StationTimetable:Toei.Arakawa.ArakawaShakomae.Toei.Minowabashi.Holiday",
              "odpt.StationTimetable:Toei.Arakawa.ArakawaShakomae.Toei.Waseda.Weekday",
              "odpt.StationTimetable:Toei.Arakawa.ArakawaShakomae.Toei.Waseda.Saturday",
              "odpt.StationTimetable:Toei.Arakawa.ArakawaShakomae.Toei.Waseda.Holiday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CF2",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.750646,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "荒川遊園地前",
            "geo:long": 139.757517,
            "owl:sameAs": "odpt.Station:Toei.Arakawa.ArakawaYuenchimae",
            "odpt:railway": "odpt.Railway:Toei.Arakawa",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "SA-12",
            "odpt:stationTitle": {
              "en": "Arakawa-yuenchimae",
              "ja": "荒川遊園地前"
            },
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Arakawa.ArakawaYuenchimae.Toei.Minowabashi.Weekday",
              "odpt.StationTimetable:Toei.Arakawa.ArakawaYuenchimae.Toei.Minowabashi.Saturday",
              "odpt.StationTimetable:Toei.Arakawa.ArakawaYuenchimae.Toei.Minowabashi.Holiday",
              "odpt.StationTimetable:Toei.Arakawa.ArakawaYuenchimae.Toei.Waseda.Weekday",
              "odpt.StationTimetable:Toei.Arakawa.ArakawaYuenchimae.Toei.Waseda.Saturday",
              "odpt.StationTimetable:Toei.Arakawa.ArakawaYuenchimae.Toei.Waseda.Holiday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CE9",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.734913,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "荒川区役所前",
            "geo:long": 139.786416,
            "owl:sameAs": "odpt.Station:Toei.Arakawa.Arakawakuyakushomae",
            "odpt:railway": "odpt.Railway:Toei.Arakawa",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "SA-03",
            "odpt:stationTitle": {
              "en": "Arakawakuyakushomae",
              "ja": "荒川区役所前"
            },
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Arakawa.Arakawakuyakushomae.Toei.Minowabashi.Weekday",
              "odpt.StationTimetable:Toei.Arakawa.Arakawakuyakushomae.Toei.Minowabashi.Saturday",
              "odpt.StationTimetable:Toei.Arakawa.Arakawakuyakushomae.Toei.Minowabashi.Holiday",
              "odpt.StationTimetable:Toei.Arakawa.Arakawakuyakushomae.Toei.Waseda.Weekday",
              "odpt.StationTimetable:Toei.Arakawa.Arakawakuyakushomae.Toei.Waseda.Saturday",
              "odpt.StationTimetable:Toei.Arakawa.Arakawakuyakushomae.Toei.Waseda.Holiday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CF7",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.750109,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "飛鳥山",
            "geo:long": 139.737333,
            "owl:sameAs": "odpt.Station:Toei.Arakawa.Asukayama",
            "odpt:railway": "odpt.Railway:Toei.Arakawa",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "SA-17",
            "odpt:stationTitle": {
              "en": "Asukayama",
              "ja": "飛鳥山"
            },
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Arakawa.Asukayama.Toei.Minowabashi.Weekday",
              "odpt.StationTimetable:Toei.Arakawa.Asukayama.Toei.Minowabashi.Saturday",
              "odpt.StationTimetable:Toei.Arakawa.Asukayama.Toei.Minowabashi.Holiday",
              "odpt.StationTimetable:Toei.Arakawa.Asukayama.Toei.Waseda.Weekday",
              "odpt.StationTimetable:Toei.Arakawa.Asukayama.Toei.Waseda.Saturday",
              "odpt.StationTimetable:Toei.Arakawa.Asukayama.Toei.Waseda.Holiday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102D02",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.716347,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "学習院下",
            "geo:long": 139.712529,
            "owl:sameAs": "odpt.Station:Toei.Arakawa.Gakushuinshita",
            "odpt:railway": "odpt.Railway:Toei.Arakawa",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "SA-28",
            "odpt:stationTitle": {
              "en": "Gakushuinshita",
              "ja": "学習院下"
            },
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Arakawa.Gakushuinshita.Toei.Minowabashi.Weekday",
              "odpt.StationTimetable:Toei.Arakawa.Gakushuinshita.Toei.Minowabashi.Saturday",
              "odpt.StationTimetable:Toei.Arakawa.Gakushuinshita.Toei.Minowabashi.Holiday",
              "odpt.StationTimetable:Toei.Arakawa.Gakushuinshita.Toei.Waseda.Weekday",
              "odpt.StationTimetable:Toei.Arakawa.Gakushuinshita.Toei.Waseda.Saturday",
              "odpt.StationTimetable:Toei.Arakawa.Gakushuinshita.Toei.Waseda.Holiday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CFF",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.725398,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "東池袋四丁目",
            "geo:long": 139.720404,
            "owl:sameAs": "odpt.Station:Toei.Arakawa.HigashiIkebukuroYonchome",
            "odpt:railway": "odpt.Railway:Toei.Arakawa",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "SA-25",
            "odpt:stationTitle": {
              "en": "Higashi-ikebukuro-yonchome",
              "ja": "東池袋四丁目"
            },
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Arakawa.HigashiIkebukuroYonchome.Toei.Minowabashi.Weekday",
              "odpt.StationTimetable:Toei.Arakawa.HigashiIkebukuroYonchome.Toei.Minowabashi.Saturday",
              "odpt.StationTimetable:Toei.Arakawa.HigashiIkebukuroYonchome.Toei.Minowabashi.Holiday",
              "odpt.StationTimetable:Toei.Arakawa.HigashiIkebukuroYonchome.Toei.Waseda.Weekday",
              "odpt.StationTimetable:Toei.Arakawa.HigashiIkebukuroYonchome.Toei.Waseda.Saturday",
              "odpt.StationTimetable:Toei.Arakawa.HigashiIkebukuroYonchome.Toei.Waseda.Holiday"
            ],
            "odpt:connectingRailway": [
              "odpt.Railway:TokyoMetro.Yurakucho"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CEE",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.745626,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "東尾久三丁目",
            "geo:long": 139.773867,
            "owl:sameAs": "odpt.Station:Toei.Arakawa.HigashiOguSanchome",
            "odpt:railway": "odpt.Railway:Toei.Arakawa",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "SA-08",
            "odpt:stationTitle": {
              "en": "Higashi-ogu-sanchome",
              "ja": "東尾久三丁目"
            },
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Arakawa.HigashiOguSanchome.Toei.Minowabashi.Weekday",
              "odpt.StationTimetable:Toei.Arakawa.HigashiOguSanchome.Toei.Minowabashi.Saturday",
              "odpt.StationTimetable:Toei.Arakawa.HigashiOguSanchome.Toei.Minowabashi.Holiday",
              "odpt.StationTimetable:Toei.Arakawa.HigashiOguSanchome.Toei.Waseda.Weekday",
              "odpt.StationTimetable:Toei.Arakawa.HigashiOguSanchome.Toei.Waseda.Saturday",
              "odpt.StationTimetable:Toei.Arakawa.HigashiOguSanchome.Toei.Waseda.Holiday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CF4",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.75107,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "梶原",
            "geo:long": 139.747268,
            "owl:sameAs": "odpt.Station:Toei.Arakawa.Kajiwara",
            "odpt:railway": "odpt.Railway:Toei.Arakawa",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "SA-14",
            "odpt:stationTitle": {
              "en": "Kajiwara",
              "ja": "梶原"
            },
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Arakawa.Kajiwara.Toei.Minowabashi.Weekday",
              "odpt.StationTimetable:Toei.Arakawa.Kajiwara.Toei.Minowabashi.Saturday",
              "odpt.StationTimetable:Toei.Arakawa.Kajiwara.Toei.Minowabashi.Holiday",
              "odpt.StationTimetable:Toei.Arakawa.Kajiwara.Toei.Waseda.Weekday",
              "odpt.StationTimetable:Toei.Arakawa.Kajiwara.Toei.Waseda.Saturday",
              "odpt.StationTimetable:Toei.Arakawa.Kajiwara.Toei.Waseda.Holiday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102D01",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.720569,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "鬼子母神前",
            "geo:long": 139.71516,
            "owl:sameAs": "odpt.Station:Toei.Arakawa.Kishibojimmae",
            "odpt:railway": "odpt.Railway:Toei.Arakawa",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "SA-27",
            "odpt:stationTitle": {
              "en": "Kishibojimmae",
              "ja": "鬼子母神前"
            },
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Arakawa.Kishibojimmae.Toei.Minowabashi.Weekday",
              "odpt.StationTimetable:Toei.Arakawa.Kishibojimmae.Toei.Minowabashi.Saturday",
              "odpt.StationTimetable:Toei.Arakawa.Kishibojimmae.Toei.Minowabashi.Holiday",
              "odpt.StationTimetable:Toei.Arakawa.Kishibojimmae.Toei.Waseda.Weekday",
              "odpt.StationTimetable:Toei.Arakawa.Kishibojimmae.Toei.Waseda.Saturday",
              "odpt.StationTimetable:Toei.Arakawa.Kishibojimmae.Toei.Waseda.Holiday"
            ],
            "odpt:connectingRailway": [
              "odpt.Railway:TokyoMetro.Fukutoshin"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CFB",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.739504,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "庚申塚",
            "geo:long": 139.729625,
            "owl:sameAs": "odpt.Station:Toei.Arakawa.Koshinzuka",
            "odpt:railway": "odpt.Railway:Toei.Arakawa",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "SA-21",
            "odpt:stationTitle": {
              "en": "Koshinzuka",
              "ja": "庚申塚"
            },
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Arakawa.Koshinzuka.Toei.Minowabashi.Weekday",
              "odpt.StationTimetable:Toei.Arakawa.Koshinzuka.Toei.Minowabashi.Saturday",
              "odpt.StationTimetable:Toei.Arakawa.Koshinzuka.Toei.Minowabashi.Holiday",
              "odpt.StationTimetable:Toei.Arakawa.Koshinzuka.Toei.Waseda.Weekday",
              "odpt.StationTimetable:Toei.Arakawa.Koshinzuka.Toei.Waseda.Saturday",
              "odpt.StationTimetable:Toei.Arakawa.Koshinzuka.Toei.Waseda.Holiday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CEF",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.748487,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "熊野前",
            "geo:long": 139.769859,
            "owl:sameAs": "odpt.Station:Toei.Arakawa.Kumanomae",
            "odpt:railway": "odpt.Railway:Toei.Arakawa",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "SA-09",
            "odpt:stationTitle": {
              "en": "Kumanomae",
              "ja": "熊野前"
            },
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Arakawa.Kumanomae.Toei.Minowabashi.Weekday",
              "odpt.StationTimetable:Toei.Arakawa.Kumanomae.Toei.Minowabashi.Saturday",
              "odpt.StationTimetable:Toei.Arakawa.Kumanomae.Toei.Minowabashi.Holiday",
              "odpt.StationTimetable:Toei.Arakawa.Kumanomae.Toei.Waseda.Weekday",
              "odpt.StationTimetable:Toei.Arakawa.Kumanomae.Toei.Waseda.Saturday",
              "odpt.StationTimetable:Toei.Arakawa.Kumanomae.Toei.Waseda.Holiday"
            ],
            "odpt:connectingRailway": [
              "odpt.Railway:Toei.NipporiToneri"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CEC",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.742783,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "町屋駅前",
            "geo:long": 139.780891,
            "owl:sameAs": "odpt.Station:Toei.Arakawa.MachiyaEkimae",
            "odpt:railway": "odpt.Railway:Toei.Arakawa",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "SA-06",
            "odpt:stationTitle": {
              "en": "Machiya-ekimae",
              "ja": "町屋駅前"
            },
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Arakawa.MachiyaEkimae.Toei.Minowabashi.Weekday",
              "odpt.StationTimetable:Toei.Arakawa.MachiyaEkimae.Toei.Minowabashi.Saturday",
              "odpt.StationTimetable:Toei.Arakawa.MachiyaEkimae.Toei.Minowabashi.Holiday",
              "odpt.StationTimetable:Toei.Arakawa.MachiyaEkimae.Toei.Waseda.Weekday",
              "odpt.StationTimetable:Toei.Arakawa.MachiyaEkimae.Toei.Waseda.Saturday",
              "odpt.StationTimetable:Toei.Arakawa.MachiyaEkimae.Toei.Waseda.Holiday"
            ],
            "odpt:connectingRailway": [
              "odpt.Railway:Keisei.Main",
              "odpt.Railway:TokyoMetro.Chiyoda"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CED",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.743919,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "町屋二丁目",
            "geo:long": 139.776416,
            "owl:sameAs": "odpt.Station:Toei.Arakawa.MachiyaNichome",
            "odpt:railway": "odpt.Railway:Toei.Arakawa",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "SA-07",
            "odpt:stationTitle": {
              "en": "Machiya-nichome",
              "ja": "町屋二丁目"
            },
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Arakawa.MachiyaNichome.Toei.Minowabashi.Weekday",
              "odpt.StationTimetable:Toei.Arakawa.MachiyaNichome.Toei.Minowabashi.Saturday",
              "odpt.StationTimetable:Toei.Arakawa.MachiyaNichome.Toei.Minowabashi.Holiday",
              "odpt.StationTimetable:Toei.Arakawa.MachiyaNichome.Toei.Waseda.Weekday",
              "odpt.StationTimetable:Toei.Arakawa.MachiyaNichome.Toei.Waseda.Saturday",
              "odpt.StationTimetable:Toei.Arakawa.MachiyaNichome.Toei.Waseda.Holiday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CF0",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.749811,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "宮ノ前",
            "geo:long": 139.76619,
            "owl:sameAs": "odpt.Station:Toei.Arakawa.Miyanomae",
            "odpt:railway": "odpt.Railway:Toei.Arakawa",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "SA-10",
            "odpt:stationTitle": {
              "en": "Miyanomae",
              "ja": "宮ノ前"
            },
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Arakawa.Miyanomae.Toei.Minowabashi.Weekday",
              "odpt.StationTimetable:Toei.Arakawa.Miyanomae.Toei.Minowabashi.Saturday",
              "odpt.StationTimetable:Toei.Arakawa.Miyanomae.Toei.Minowabashi.Holiday",
              "odpt.StationTimetable:Toei.Arakawa.Miyanomae.Toei.Waseda.Weekday",
              "odpt.StationTimetable:Toei.Arakawa.Miyanomae.Toei.Waseda.Saturday",
              "odpt.StationTimetable:Toei.Arakawa.Miyanomae.Toei.Waseda.Holiday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CFE",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.728775,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "向原",
            "geo:long": 139.724759,
            "owl:sameAs": "odpt.Station:Toei.Arakawa.Mukohara",
            "odpt:railway": "odpt.Railway:Toei.Arakawa",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "SA-24",
            "odpt:stationTitle": {
              "en": "Mukohara",
              "ja": "向原"
            },
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Arakawa.Mukohara.Toei.Minowabashi.Weekday",
              "odpt.StationTimetable:Toei.Arakawa.Mukohara.Toei.Minowabashi.Saturday",
              "odpt.StationTimetable:Toei.Arakawa.Mukohara.Toei.Minowabashi.Holiday",
              "odpt.StationTimetable:Toei.Arakawa.Mukohara.Toei.Waseda.Weekday",
              "odpt.StationTimetable:Toei.Arakawa.Mukohara.Toei.Waseda.Saturday",
              "odpt.StationTimetable:Toei.Arakawa.Mukohara.Toei.Waseda.Holiday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CF9",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.744222,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "西ヶ原四丁目",
            "geo:long": 139.732665,
            "owl:sameAs": "odpt.Station:Toei.Arakawa.NishigaharaYonchome",
            "odpt:railway": "odpt.Railway:Toei.Arakawa",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "SA-19",
            "odpt:stationTitle": {
              "en": "Nishigahara-yonchome",
              "ja": "西ヶ原四丁目"
            },
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Arakawa.NishigaharaYonchome.Toei.Minowabashi.Weekday",
              "odpt.StationTimetable:Toei.Arakawa.NishigaharaYonchome.Toei.Minowabashi.Saturday",
              "odpt.StationTimetable:Toei.Arakawa.NishigaharaYonchome.Toei.Minowabashi.Holiday",
              "odpt.StationTimetable:Toei.Arakawa.NishigaharaYonchome.Toei.Waseda.Weekday",
              "odpt.StationTimetable:Toei.Arakawa.NishigaharaYonchome.Toei.Waseda.Saturday",
              "odpt.StationTimetable:Toei.Arakawa.NishigaharaYonchome.Toei.Waseda.Holiday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CF6",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.752982,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "王子駅前",
            "geo:long": 139.738045,
            "owl:sameAs": "odpt.Station:Toei.Arakawa.OjiEkimae",
            "odpt:railway": "odpt.Railway:Toei.Arakawa",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "SA-16",
            "odpt:stationTitle": {
              "en": "Oji-ekimae",
              "ja": "王子駅前"
            },
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Arakawa.OjiEkimae.Toei.Minowabashi.Weekday",
              "odpt.StationTimetable:Toei.Arakawa.OjiEkimae.Toei.Minowabashi.Saturday",
              "odpt.StationTimetable:Toei.Arakawa.OjiEkimae.Toei.Minowabashi.Holiday",
              "odpt.StationTimetable:Toei.Arakawa.OjiEkimae.Toei.Waseda.Weekday",
              "odpt.StationTimetable:Toei.Arakawa.OjiEkimae.Toei.Waseda.Saturday",
              "odpt.StationTimetable:Toei.Arakawa.OjiEkimae.Toei.Waseda.Holiday"
            ],
            "odpt:connectingRailway": [
              "odpt.Railway:JR-East.KeihinTohokuNegishi",
              "odpt.Railway:TokyoMetro.Namboku"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102D03",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.713012,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "面影橋",
            "geo:long": 139.714199,
            "owl:sameAs": "odpt.Station:Toei.Arakawa.Omokagebashi",
            "odpt:railway": "odpt.Railway:Toei.Arakawa",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "SA-29",
            "odpt:stationTitle": {
              "en": "Omokagebashi",
              "ja": "面影橋"
            },
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Arakawa.Omokagebashi.Toei.Minowabashi.Weekday",
              "odpt.StationTimetable:Toei.Arakawa.Omokagebashi.Toei.Minowabashi.Saturday",
              "odpt.StationTimetable:Toei.Arakawa.Omokagebashi.Toei.Minowabashi.Holiday",
              "odpt.StationTimetable:Toei.Arakawa.Omokagebashi.Toei.Waseda.Weekday",
              "odpt.StationTimetable:Toei.Arakawa.Omokagebashi.Toei.Waseda.Saturday",
              "odpt.StationTimetable:Toei.Arakawa.Omokagebashi.Toei.Waseda.Holiday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CFD",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.731188,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "大塚駅前",
            "geo:long": 139.729098,
            "owl:sameAs": "odpt.Station:Toei.Arakawa.OtsukaEkimae",
            "odpt:railway": "odpt.Railway:Toei.Arakawa",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "SA-23",
            "odpt:stationTitle": {
              "en": "Otsuka-ekimae",
              "ja": "大塚駅前"
            },
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Arakawa.OtsukaEkimae.Toei.Minowabashi.Weekday",
              "odpt.StationTimetable:Toei.Arakawa.OtsukaEkimae.Toei.Minowabashi.Saturday",
              "odpt.StationTimetable:Toei.Arakawa.OtsukaEkimae.Toei.Minowabashi.Holiday",
              "odpt.StationTimetable:Toei.Arakawa.OtsukaEkimae.Toei.Waseda.Weekday",
              "odpt.StationTimetable:Toei.Arakawa.OtsukaEkimae.Toei.Waseda.Saturday",
              "odpt.StationTimetable:Toei.Arakawa.OtsukaEkimae.Toei.Waseda.Holiday"
            ],
            "odpt:connectingRailway": [
              "odpt.Railway:JR-East.Yamanote"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CF5",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.750865,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "栄町",
            "geo:long": 139.742186,
            "owl:sameAs": "odpt.Station:Toei.Arakawa.Sakaecho",
            "odpt:railway": "odpt.Railway:Toei.Arakawa",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "SA-15",
            "odpt:stationTitle": {
              "en": "Sakaecho",
              "ja": "栄町"
            },
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Arakawa.Sakaecho.Toei.Minowabashi.Weekday",
              "odpt.StationTimetable:Toei.Arakawa.Sakaecho.Toei.Minowabashi.Saturday",
              "odpt.StationTimetable:Toei.Arakawa.Sakaecho.Toei.Minowabashi.Holiday",
              "odpt.StationTimetable:Toei.Arakawa.Sakaecho.Toei.Waseda.Weekday",
              "odpt.StationTimetable:Toei.Arakawa.Sakaecho.Toei.Waseda.Saturday",
              "odpt.StationTimetable:Toei.Arakawa.Sakaecho.Toei.Waseda.Holiday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CA4",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.776082,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "志村坂上",
            "geo:long": 139.695097,
            "owl:sameAs": "odpt.Station:Toei.Mita.ShimuraSakaue",
            "odpt:railway": "odpt.Railway:Toei.Mita",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "I-21",
            "odpt:stationTitle": {
              "en": "Shimura-sakaue",
              "ja": "志村坂上"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.ShimuraSakaue"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Mita.ShimuraSakaue.Southbound.Weekday",
              "odpt.StationTimetable:Toei.Mita.ShimuraSakaue.Southbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Mita.ShimuraSakaue.Northbound.Weekday",
              "odpt.StationTimetable:Toei.Mita.ShimuraSakaue.Northbound.SaturdayHoliday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CFA",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.74107,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "新庚申塚",
            "geo:long": 139.730344,
            "owl:sameAs": "odpt.Station:Toei.Arakawa.ShinKoshinzuka",
            "odpt:railway": "odpt.Railway:Toei.Arakawa",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "SA-20",
            "odpt:stationTitle": {
              "en": "Shin-koshinzuka",
              "ja": "新庚申塚"
            },
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Arakawa.ShinKoshinzuka.Toei.Minowabashi.Weekday",
              "odpt.StationTimetable:Toei.Arakawa.ShinKoshinzuka.Toei.Minowabashi.Saturday",
              "odpt.StationTimetable:Toei.Arakawa.ShinKoshinzuka.Toei.Minowabashi.Holiday",
              "odpt.StationTimetable:Toei.Arakawa.ShinKoshinzuka.Toei.Waseda.Weekday",
              "odpt.StationTimetable:Toei.Arakawa.ShinKoshinzuka.Toei.Waseda.Saturday",
              "odpt.StationTimetable:Toei.Arakawa.ShinKoshinzuka.Toei.Waseda.Holiday"
            ],
            "odpt:connectingRailway": [
              "odpt.Railway:Toei.Mita"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CFC",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.735682,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "巣鴨新田",
            "geo:long": 139.727684,
            "owl:sameAs": "odpt.Station:Toei.Arakawa.Sugamoshinden",
            "odpt:railway": "odpt.Railway:Toei.Arakawa",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "SA-22",
            "odpt:stationTitle": {
              "en": "Sugamoshinden",
              "ja": "巣鴨新田"
            },
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Arakawa.Sugamoshinden.Toei.Minowabashi.Weekday",
              "odpt.StationTimetable:Toei.Arakawa.Sugamoshinden.Toei.Minowabashi.Saturday",
              "odpt.StationTimetable:Toei.Arakawa.Sugamoshinden.Toei.Minowabashi.Holiday",
              "odpt.StationTimetable:Toei.Arakawa.Sugamoshinden.Toei.Waseda.Weekday",
              "odpt.StationTimetable:Toei.Arakawa.Sugamoshinden.Toei.Waseda.Saturday",
              "odpt.StationTimetable:Toei.Arakawa.Sugamoshinden.Toei.Waseda.Holiday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CF8",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.747283,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "滝野川一丁目",
            "geo:long": 139.73542,
            "owl:sameAs": "odpt.Station:Toei.Arakawa.TakinogawaItchome",
            "odpt:railway": "odpt.Railway:Toei.Arakawa",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "SA-18",
            "odpt:stationTitle": {
              "en": "Takinogawa-itchome",
              "ja": "滝野川一丁目"
            },
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Arakawa.TakinogawaItchome.Toei.Minowabashi.Weekday",
              "odpt.StationTimetable:Toei.Arakawa.TakinogawaItchome.Toei.Minowabashi.Saturday",
              "odpt.StationTimetable:Toei.Arakawa.TakinogawaItchome.Toei.Minowabashi.Holiday",
              "odpt.StationTimetable:Toei.Arakawa.TakinogawaItchome.Toei.Waseda.Weekday",
              "odpt.StationTimetable:Toei.Arakawa.TakinogawaItchome.Toei.Waseda.Saturday",
              "odpt.StationTimetable:Toei.Arakawa.TakinogawaItchome.Toei.Waseda.Holiday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102D00",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.724081,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "都電雑司ヶ谷",
            "geo:long": 139.717835,
            "owl:sameAs": "odpt.Station:Toei.Arakawa.TodenZoshigaya",
            "odpt:railway": "odpt.Railway:Toei.Arakawa",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "SA-26",
            "odpt:stationTitle": {
              "en": "Toden-zoshigaya",
              "ja": "都電雑司ヶ谷"
            },
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Arakawa.TodenZoshigaya.Toei.Minowabashi.Weekday",
              "odpt.StationTimetable:Toei.Arakawa.TodenZoshigaya.Toei.Minowabashi.Saturday",
              "odpt.StationTimetable:Toei.Arakawa.TodenZoshigaya.Toei.Minowabashi.Holiday",
              "odpt.StationTimetable:Toei.Arakawa.TodenZoshigaya.Toei.Waseda.Weekday",
              "odpt.StationTimetable:Toei.Arakawa.TodenZoshigaya.Toei.Waseda.Saturday",
              "odpt.StationTimetable:Toei.Arakawa.TodenZoshigaya.Toei.Waseda.Holiday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102C8B",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.697494,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "浅草橋",
            "geo:long": 139.786335,
            "owl:sameAs": "odpt.Station:Toei.Asakusa.Asakusabashi",
            "odpt:railway": "odpt.Railway:Toei.Asakusa",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "A-16",
            "odpt:stationTitle": {
              "en": "Asakusabashi",
              "ja": "浅草橋"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Asakusabashi"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Asakusa.Asakusabashi.Southbound.Weekday",
              "odpt.StationTimetable:Toei.Asakusa.Asakusabashi.Southbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Asakusa.Asakusabashi.Northbound.Weekday",
              "odpt.StationTimetable:Toei.Asakusa.Asakusabashi.Northbound.SaturdayHoliday"
            ],
            "odpt:connectingRailway": [
              "odpt.Railway:JR-East.ChuoSobuLocal"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102C8D",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.70892,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "浅草",
            "geo:long": 139.796542,
            "owl:sameAs": "odpt.Station:Toei.Asakusa.Asakusa",
            "odpt:railway": "odpt.Railway:Toei.Asakusa",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "A-18",
            "odpt:stationTitle": {
              "en": "Asakusa",
              "ja": "浅草"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Asakusa"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Asakusa.Asakusa.Southbound.Weekday",
              "odpt.StationTimetable:Toei.Asakusa.Asakusa.Southbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Asakusa.Asakusa.Northbound.Weekday",
              "odpt.StationTimetable:Toei.Asakusa.Asakusa.Northbound.SaturdayHoliday"
            ],
            "odpt:connectingRailway": [
              "odpt.Railway:TokyoMetro.Ginza",
              "odpt.Railway:Tobu.TobuSkytree"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102C84",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.65687,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "大門",
            "geo:long": 139.754679,
            "owl:sameAs": "odpt.Station:Toei.Asakusa.Daimon",
            "odpt:railway": "odpt.Railway:Toei.Asakusa",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "A-09",
            "odpt:stationTitle": {
              "en": "Daimon",
              "ja": "大門"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Asakusa.Daimon"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Asakusa.Daimon.Southbound.Weekday",
              "odpt.StationTimetable:Toei.Asakusa.Daimon.Southbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Asakusa.Daimon.Northbound.Weekday",
              "odpt.StationTimetable:Toei.Asakusa.Daimon.Northbound.SaturdayHoliday"
            ],
            "odpt:connectingRailway": [
              "odpt.Railway:JR-East.KeihinTohokuNegishi",
              "odpt.Railway:JR-East.Yamanote",
              "odpt.Railway:Toei.Oedo",
              "odpt.Railway:TokyoMonorail.HanedaAirport"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102C80",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.626878,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "五反田",
            "geo:long": 139.723965,
            "owl:sameAs": "odpt.Station:Toei.Asakusa.Gotanda",
            "odpt:railway": "odpt.Railway:Toei.Asakusa",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "A-05",
            "odpt:stationTitle": {
              "en": "Gotanda",
              "ja": "五反田"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Gotanda"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Asakusa.Gotanda.Southbound.Weekday",
              "odpt.StationTimetable:Toei.Asakusa.Gotanda.Southbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Asakusa.Gotanda.Northbound.Weekday",
              "odpt.StationTimetable:Toei.Asakusa.Gotanda.Northbound.SaturdayHoliday"
            ],
            "odpt:connectingRailway": [
              "odpt.Railway:JR-East.Yamanote",
              "odpt.Railway:Tokyu.Ikegami"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102C86",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.669915,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "東銀座",
            "geo:long": 139.76735,
            "owl:sameAs": "odpt.Station:Toei.Asakusa.HigashiGinza",
            "odpt:railway": "odpt.Railway:Toei.Asakusa",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "A-11",
            "odpt:stationTitle": {
              "en": "Higashi-ginza",
              "ja": "東銀座"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.HigashiGinza"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Asakusa.HigashiGinza.Southbound.Weekday",
              "odpt.StationTimetable:Toei.Asakusa.HigashiGinza.Southbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Asakusa.HigashiGinza.Northbound.Weekday",
              "odpt.StationTimetable:Toei.Asakusa.HigashiGinza.Northbound.SaturdayHoliday"
            ],
            "odpt:connectingRailway": [
              "odpt.Railway:TokyoMetro.Hibiya"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102C8A",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.692123,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "東日本橋",
            "geo:long": 139.784886,
            "owl:sameAs": "odpt.Station:Toei.Asakusa.HigashiNihombashi",
            "odpt:railway": "odpt.Railway:Toei.Asakusa",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "A-15",
            "odpt:stationTitle": {
              "en": "Higashi-nihombashi",
              "ja": "東日本橋"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.HigashiNihombashi"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Asakusa.HigashiNihombashi.Southbound.Weekday",
              "odpt.StationTimetable:Toei.Asakusa.HigashiNihombashi.Southbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Asakusa.HigashiNihombashi.Northbound.Weekday",
              "odpt.StationTimetable:Toei.Asakusa.HigashiNihombashi.Northbound.SaturdayHoliday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102C8E",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.708565,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "本所吾妻橋",
            "geo:long": 139.804397,
            "owl:sameAs": "odpt.Station:Toei.Asakusa.HonjoAzumabashi",
            "odpt:railway": "odpt.Railway:Toei.Asakusa",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "A-19",
            "odpt:stationTitle": {
              "en": "Honjo-azumabashi",
              "ja": "本所吾妻橋"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.HonjoAzumabashi"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Asakusa.HonjoAzumabashi.Southbound.Weekday",
              "odpt.StationTimetable:Toei.Asakusa.HonjoAzumabashi.Southbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Asakusa.HonjoAzumabashi.Northbound.Weekday",
              "odpt.StationTimetable:Toei.Asakusa.HonjoAzumabashi.Northbound.SaturdayHoliday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102C8C",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.703128,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "蔵前",
            "geo:long": 139.790858,
            "owl:sameAs": "odpt.Station:Toei.Asakusa.Kuramae",
            "odpt:railway": "odpt.Railway:Toei.Asakusa",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "A-17",
            "odpt:stationTitle": {
              "en": "Kuramae",
              "ja": "蔵前"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Asakusa.Kuramae"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Asakusa.Kuramae.Southbound.Weekday",
              "odpt.StationTimetable:Toei.Asakusa.Kuramae.Southbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Asakusa.Kuramae.Northbound.Weekday",
              "odpt.StationTimetable:Toei.Asakusa.Kuramae.Northbound.SaturdayHoliday"
            ],
            "odpt:connectingRailway": [
              "odpt.Railway:Toei.Oedo"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102C83",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.646749,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "三田",
            "geo:long": 139.746877,
            "owl:sameAs": "odpt.Station:Toei.Asakusa.Mita",
            "odpt:railway": "odpt.Railway:Toei.Asakusa",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "A-08",
            "odpt:stationTitle": {
              "en": "Mita",
              "ja": "三田"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Asakusa.Mita"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Asakusa.Mita.Southbound.Weekday",
              "odpt.StationTimetable:Toei.Asakusa.Mita.Southbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Asakusa.Mita.Northbound.Weekday",
              "odpt.StationTimetable:Toei.Asakusa.Mita.Northbound.SaturdayHoliday"
            ],
            "odpt:connectingRailway": [
              "odpt.Railway:JR-East.KeihinTohokuNegishi",
              "odpt.Railway:JR-East.Yamanote",
              "odpt.Railway:Toei.Mita"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102C7E",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.605274,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "中延",
            "geo:long": 139.713645,
            "owl:sameAs": "odpt.Station:Toei.Asakusa.Nakanobu",
            "odpt:railway": "odpt.Railway:Toei.Asakusa",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "A-03",
            "odpt:stationTitle": {
              "en": "Nakanobu",
              "ja": "中延"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Nakanobu"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Asakusa.Nakanobu.Southbound.Weekday",
              "odpt.StationTimetable:Toei.Asakusa.Nakanobu.Southbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Asakusa.Nakanobu.Northbound.Weekday",
              "odpt.StationTimetable:Toei.Asakusa.Nakanobu.Northbound.SaturdayHoliday"
            ],
            "odpt:connectingRailway": [
              "odpt.Railway:Tokyu.Oimachi"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CAA",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.791965,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "西高島平",
            "geo:long": 139.645421,
            "owl:sameAs": "odpt.Station:Toei.Mita.NishiTakashimadaira",
            "odpt:railway": "odpt.Railway:Toei.Mita",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "I-27",
            "odpt:stationTitle": {
              "en": "Nishi-takashimadaira",
              "ja": "西高島平"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.NishiTakashimadaira"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Mita.NishiTakashimadaira.Southbound.Weekday",
              "odpt.StationTimetable:Toei.Mita.NishiTakashimadaira.Southbound.SaturdayHoliday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102C88",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.681796,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "日本橋",
            "geo:long": 139.775814,
            "owl:sameAs": "odpt.Station:Toei.Asakusa.Nihombashi",
            "odpt:railway": "odpt.Railway:Toei.Asakusa",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "A-13",
            "odpt:stationTitle": {
              "en": "Nihombashi",
              "ja": "日本橋"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Nihombashi"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Asakusa.Nihombashi.Southbound.Weekday",
              "odpt.StationTimetable:Toei.Asakusa.Nihombashi.Southbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Asakusa.Nihombashi.Northbound.Weekday",
              "odpt.StationTimetable:Toei.Asakusa.Nihombashi.Northbound.SaturdayHoliday"
            ],
            "odpt:connectingRailway": [
              "odpt.Railway:TokyoMetro.Ginza",
              "odpt.Railway:TokyoMetro.Tozai"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102C9C",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.721682,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "白山",
            "geo:long": 139.752134,
            "owl:sameAs": "odpt.Station:Toei.Mita.Hakusan",
            "odpt:railway": "odpt.Railway:Toei.Mita",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "I-13",
            "odpt:stationTitle": {
              "en": "Hakusan",
              "ja": "白山"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Hakusan"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Mita.Hakusan.Southbound.Weekday",
              "odpt.StationTimetable:Toei.Mita.Hakusan.Southbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Mita.Hakusan.Northbound.Weekday",
              "odpt.StationTimetable:Toei.Mita.Hakusan.Northbound.SaturdayHoliday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102C89",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.686345,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "人形町",
            "geo:long": 139.782276,
            "owl:sameAs": "odpt.Station:Toei.Asakusa.Ningyocho",
            "odpt:railway": "odpt.Railway:Toei.Asakusa",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "A-14",
            "odpt:stationTitle": {
              "en": "Ningyocho",
              "ja": "人形町"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Ningyocho"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Asakusa.Ningyocho.Southbound.Weekday",
              "odpt.StationTimetable:Toei.Asakusa.Ningyocho.Southbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Asakusa.Ningyocho.Northbound.Weekday",
              "odpt.StationTimetable:Toei.Asakusa.Ningyocho.Northbound.SaturdayHoliday"
            ],
            "odpt:connectingRailway": [
              "odpt.Railway:TokyoMetro.Hanzomon",
              "odpt.Railway:TokyoMetro.Hibiya"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102C7C",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.58705,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "西馬込",
            "geo:long": 139.706086,
            "owl:sameAs": "odpt.Station:Toei.Asakusa.NishiMagome",
            "odpt:railway": "odpt.Railway:Toei.Asakusa",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "A-01",
            "odpt:stationTitle": {
              "en": "Nishi-magome",
              "ja": "西馬込"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.NishiMagome"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Asakusa.NishiMagome.Northbound.Weekday",
              "odpt.StationTimetable:Toei.Asakusa.NishiMagome.Northbound.SaturdayHoliday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102C8F",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.710824,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "押上",
            "geo:long": 139.812993,
            "owl:sameAs": "odpt.Station:Toei.Asakusa.Oshiage",
            "odpt:railway": "odpt.Railway:Toei.Asakusa",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "A-20",
            "odpt:stationTitle": {
              "en": "Oshiage",
              "ja": "押上"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Oshiage"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Asakusa.Oshiage.Southbound.Weekday",
              "odpt.StationTimetable:Toei.Asakusa.Oshiage.Southbound.SaturdayHoliday"
            ],
            "odpt:connectingRailway": [
              "odpt.Railway:Keisei.Oshiage",
              "odpt.Railway:Tobu.TobuSkytreeBranch",
              "odpt.Railway:TokyoMetro.Hanzomon"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102C82",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.638715,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "泉岳寺",
            "geo:long": 139.739993,
            "owl:sameAs": "odpt.Station:Toei.Asakusa.Sengakuji",
            "odpt:railway": "odpt.Railway:Toei.Asakusa",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "A-07",
            "odpt:stationTitle": {
              "en": "Sengakuji",
              "ja": "泉岳寺"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Sengakuji"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Asakusa.Sengakuji.Southbound.Weekday",
              "odpt.StationTimetable:Toei.Asakusa.Sengakuji.Southbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Asakusa.Sengakuji.Northbound.Weekday",
              "odpt.StationTimetable:Toei.Asakusa.Sengakuji.Northbound.SaturdayHoliday"
            ],
            "odpt:connectingRailway": [
              "odpt.Railway:JR-East.KeihinTohokuNegishi",
              "odpt.Railway:JR-East.Yamanote",
              "odpt.Railway:Keikyu.Main"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CA2",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.761309,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "板橋本町",
            "geo:long": 139.705544,
            "owl:sameAs": "odpt.Station:Toei.Mita.Itabashihoncho",
            "odpt:railway": "odpt.Railway:Toei.Mita",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "I-19",
            "odpt:stationTitle": {
              "en": "Itabashihoncho",
              "ja": "板橋本町"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Itabashihoncho"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Mita.Itabashihoncho.Southbound.Weekday",
              "odpt.StationTimetable:Toei.Mita.Itabashihoncho.Southbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Mita.Itabashihoncho.Northbound.Weekday",
              "odpt.StationTimetable:Toei.Mita.Itabashihoncho.Northbound.SaturdayHoliday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102C85",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.665386,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "新橋",
            "geo:long": 139.759338,
            "owl:sameAs": "odpt.Station:Toei.Asakusa.Shimbashi",
            "odpt:railway": "odpt.Railway:Toei.Asakusa",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "A-10",
            "odpt:stationTitle": {
              "en": "Shimbashi",
              "ja": "新橋"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Shimbashi"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Asakusa.Shimbashi.Southbound.Weekday",
              "odpt.StationTimetable:Toei.Asakusa.Shimbashi.Southbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Asakusa.Shimbashi.Northbound.Weekday",
              "odpt.StationTimetable:Toei.Asakusa.Shimbashi.Northbound.SaturdayHoliday"
            ],
            "odpt:connectingRailway": [
              "odpt.Railway:JR-East.JobanRapid",
              "odpt.Railway:JR-East.KeihinTohokuNegishi",
              "odpt.Railway:JR-East.Tokaido",
              "odpt.Railway:JR-East.Yamanote",
              "odpt.Railway:JR-East.Yokosuka",
              "odpt.Railway:TokyoMetro.Ginza",
              "odpt.Railway:Yurikamome.Yurikamome"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102C81",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.631751,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "高輪台",
            "geo:long": 139.730384,
            "owl:sameAs": "odpt.Station:Toei.Asakusa.Takanawadai",
            "odpt:railway": "odpt.Railway:Toei.Asakusa",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "A-06",
            "odpt:stationTitle": {
              "en": "Takanawadai",
              "ja": "高輪台"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Takanawadai"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Asakusa.Takanawadai.Southbound.Weekday",
              "odpt.StationTimetable:Toei.Asakusa.Takanawadai.Southbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Asakusa.Takanawadai.Northbound.Weekday",
              "odpt.StationTimetable:Toei.Asakusa.Takanawadai.Northbound.SaturdayHoliday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102C87",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.675606,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "宝町",
            "geo:long": 139.771966,
            "owl:sameAs": "odpt.Station:Toei.Asakusa.Takaracho",
            "odpt:railway": "odpt.Railway:Toei.Asakusa",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "A-12",
            "odpt:stationTitle": {
              "en": "Takaracho",
              "ja": "宝町"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Takaracho"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Asakusa.Takaracho.Southbound.Weekday",
              "odpt.StationTimetable:Toei.Asakusa.Takaracho.Southbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Asakusa.Takaracho.Northbound.Weekday",
              "odpt.StationTimetable:Toei.Asakusa.Takaracho.Northbound.SaturdayHoliday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CA6",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.784262,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "蓮根",
            "geo:long": 139.678947,
            "owl:sameAs": "odpt.Station:Toei.Mita.Hasune",
            "odpt:railway": "odpt.Railway:Toei.Mita",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "I-23",
            "odpt:stationTitle": {
              "en": "Hasune",
              "ja": "蓮根"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Hasune"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Mita.Hasune.Southbound.Weekday",
              "odpt.StationTimetable:Toei.Mita.Hasune.Southbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Mita.Hasune.Northbound.Weekday",
              "odpt.StationTimetable:Toei.Mita.Hasune.Northbound.SaturdayHoliday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102C97",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.676585,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "日比谷",
            "geo:long": 139.760274,
            "owl:sameAs": "odpt.Station:Toei.Mita.Hibiya",
            "odpt:railway": "odpt.Railway:Toei.Mita",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "I-08",
            "odpt:stationTitle": {
              "en": "Hibiya",
              "ja": "日比谷"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Hibiya"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Mita.Hibiya.Southbound.Weekday",
              "odpt.StationTimetable:Toei.Mita.Hibiya.Southbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Mita.Hibiya.Northbound.Weekday",
              "odpt.StationTimetable:Toei.Mita.Hibiya.Northbound.SaturdayHoliday"
            ],
            "odpt:connectingRailway": [
              "odpt.Railway:JR-East.KeihinTohokuNegishi",
              "odpt.Railway:JR-East.Yamanote",
              "odpt.Railway:TokyoMetro.Chiyoda",
              "odpt.Railway:TokyoMetro.Hibiya",
              "odpt.Railway:TokyoMetro.Yurakucho"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CA1",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.751372,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "板橋区役所前",
            "geo:long": 139.71012,
            "owl:sameAs": "odpt.Station:Toei.Mita.ItabashiKuyakushomae",
            "odpt:railway": "odpt.Railway:Toei.Mita",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "I-18",
            "odpt:stationTitle": {
              "en": "Itabashi-kuyakushomae",
              "ja": "板橋区役所前"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.ItabashiKuyakushomae"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Mita.ItabashiKuyakushomae.Southbound.Weekday",
              "odpt.StationTimetable:Toei.Mita.ItabashiKuyakushomae.Southbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Mita.ItabashiKuyakushomae.Northbound.Weekday",
              "odpt.StationTimetable:Toei.Mita.ItabashiKuyakushomae.Northbound.SaturdayHoliday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102C99",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.695331,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "神保町",
            "geo:long": 139.758213,
            "owl:sameAs": "odpt.Station:Toei.Mita.Jimbocho",
            "odpt:railway": "odpt.Railway:Toei.Mita",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "I-10",
            "odpt:stationTitle": {
              "en": "Jimbocho",
              "ja": "神保町"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Mita.Jimbocho"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Mita.Jimbocho.Southbound.Weekday",
              "odpt.StationTimetable:Toei.Mita.Jimbocho.Southbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Mita.Jimbocho.Northbound.Weekday",
              "odpt.StationTimetable:Toei.Mita.Jimbocho.Northbound.SaturdayHoliday"
            ],
            "odpt:connectingRailway": [
              "odpt.Railway:Toei.Shinjuku",
              "odpt.Railway:TokyoMetro.Hanzomon"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102C9B",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.709532,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "春日",
            "geo:long": 139.753287,
            "owl:sameAs": "odpt.Station:Toei.Mita.Kasuga",
            "odpt:railway": "odpt.Railway:Toei.Mita",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "I-12",
            "odpt:stationTitle": {
              "en": "Kasuga",
              "ja": "春日"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Mita.Kasuga"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Mita.Kasuga.Southbound.Weekday",
              "odpt.StationTimetable:Toei.Mita.Kasuga.Southbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Mita.Kasuga.Northbound.Weekday",
              "odpt.StationTimetable:Toei.Mita.Kasuga.Northbound.SaturdayHoliday"
            ],
            "odpt:connectingRailway": [
              "odpt.Railway:Toei.Oedo",
              "odpt.Railway:TokyoMetro.Marunouchi",
              "odpt.Railway:TokyoMetro.Namboku"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102C90",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.633635,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "目黒",
            "geo:long": 139.715444,
            "owl:sameAs": "odpt.Station:Toei.Mita.Meguro",
            "odpt:railway": "odpt.Railway:Toei.Mita",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "I-01",
            "odpt:stationTitle": {
              "en": "Meguro",
              "ja": "目黒"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Meguro"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Mita.Meguro.Northbound.Weekday",
              "odpt.StationTimetable:Toei.Mita.Meguro.Northbound.SaturdayHoliday"
            ],
            "odpt:connectingRailway": [
              "odpt.Railway:JR-East.Yamanote",
              "odpt.Railway:TokyoMetro.Namboku",
              "odpt.Railway:Tokyu.Meguro"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102C93",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.64865,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "三田",
            "geo:long": 139.748998,
            "owl:sameAs": "odpt.Station:Toei.Mita.Mita",
            "odpt:railway": "odpt.Railway:Toei.Mita",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "I-04",
            "odpt:stationTitle": {
              "en": "Mita",
              "ja": "三田"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Mita.Mita"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Mita.Mita.Southbound.Weekday",
              "odpt.StationTimetable:Toei.Mita.Mita.Southbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Mita.Mita.Northbound.Weekday",
              "odpt.StationTimetable:Toei.Mita.Mita.Northbound.SaturdayHoliday"
            ],
            "odpt:connectingRailway": [
              "odpt.Railway:JR-East.KeihinTohokuNegishi",
              "odpt.Railway:JR-East.Yamanote",
              "odpt.Railway:Toei.Asakusa"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CA3",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.768566,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "本蓮沼",
            "geo:long": 139.70241,
            "owl:sameAs": "odpt.Station:Toei.Mita.Motohasunuma",
            "odpt:railway": "odpt.Railway:Toei.Mita",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "I-20",
            "odpt:stationTitle": {
              "en": "Motohasunuma",
              "ja": "本蓮沼"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Motohasunuma"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Mita.Motohasunuma.Southbound.Weekday",
              "odpt.StationTimetable:Toei.Mita.Motohasunuma.Southbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Mita.Motohasunuma.Northbound.Weekday",
              "odpt.StationTimetable:Toei.Mita.Motohasunuma.Northbound.SaturdayHoliday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CBF",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.722819,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "本八幡",
            "geo:long": 139.926613,
            "owl:sameAs": "odpt.Station:Toei.Shinjuku.Motoyawata",
            "odpt:railway": "odpt.Railway:Toei.Shinjuku",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "S-21",
            "odpt:stationTitle": {
              "en": "Motoyawata",
              "ja": "本八幡"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Motoyawata"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Shinjuku.Motoyawata.Westbound.Weekday",
              "odpt.StationTimetable:Toei.Shinjuku.Motoyawata.Westbound.SaturdayHoliday"
            ],
            "odpt:connectingRailway": [
              "odpt.Railway:JR-East.ChuoSobuLocal",
              "odpt.Railway:Keisei.Main"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102C9F",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.743568,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "西巣鴨",
            "geo:long": 139.728703,
            "owl:sameAs": "odpt.Station:Toei.Mita.NishiSugamo",
            "odpt:railway": "odpt.Railway:Toei.Mita",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "I-16",
            "odpt:stationTitle": {
              "en": "Nishi-sugamo",
              "ja": "西巣鴨"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.NishiSugamo"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Mita.NishiSugamo.Southbound.Weekday",
              "odpt.StationTimetable:Toei.Mita.NishiSugamo.Southbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Mita.NishiSugamo.Northbound.Weekday",
              "odpt.StationTimetable:Toei.Mita.NishiSugamo.Northbound.SaturdayHoliday"
            ],
            "odpt:connectingRailway": [
              "odpt.Railway:Toei.Arakawa"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CA7",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.787074,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "西台",
            "geo:long": 139.672867,
            "owl:sameAs": "odpt.Station:Toei.Mita.Nishidai",
            "odpt:railway": "odpt.Railway:Toei.Mita",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "I-24",
            "odpt:stationTitle": {
              "en": "Nishidai",
              "ja": "西台"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Nishidai"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Mita.Nishidai.Southbound.Weekday",
              "odpt.StationTimetable:Toei.Mita.Nishidai.Southbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Mita.Nishidai.Northbound.Weekday",
              "odpt.StationTimetable:Toei.Mita.Nishidai.Northbound.SaturdayHoliday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102C95",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.660774,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "御成門",
            "geo:long": 139.751366,
            "owl:sameAs": "odpt.Station:Toei.Mita.Onarimon",
            "odpt:railway": "odpt.Railway:Toei.Mita",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "I-06",
            "odpt:stationTitle": {
              "en": "Onarimon",
              "ja": "御成門"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Onarimon"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Mita.Onarimon.Southbound.Weekday",
              "odpt.StationTimetable:Toei.Mita.Onarimon.Southbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Mita.Onarimon.Northbound.Weekday",
              "odpt.StationTimetable:Toei.Mita.Onarimon.Northbound.SaturdayHoliday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102C98",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.684093,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "大手町",
            "geo:long": 139.762798,
            "owl:sameAs": "odpt.Station:Toei.Mita.Otemachi",
            "odpt:railway": "odpt.Railway:Toei.Mita",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "I-09",
            "odpt:stationTitle": {
              "en": "Otemachi",
              "ja": "大手町"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Otemachi"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Mita.Otemachi.Southbound.Weekday",
              "odpt.StationTimetable:Toei.Mita.Otemachi.Southbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Mita.Otemachi.Northbound.Weekday",
              "odpt.StationTimetable:Toei.Mita.Otemachi.Northbound.SaturdayHoliday"
            ],
            "odpt:connectingRailway": [
              "odpt.Railway:TokyoMetro.Chiyoda",
              "odpt.Railway:TokyoMetro.Hanzomon",
              "odpt.Railway:TokyoMetro.Marunouchi",
              "odpt.Railway:TokyoMetro.Tozai"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102C9D",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.727772,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "千石",
            "geo:long": 139.744984,
            "owl:sameAs": "odpt.Station:Toei.Mita.Sengoku",
            "odpt:railway": "odpt.Railway:Toei.Mita",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "I-14",
            "odpt:stationTitle": {
              "en": "Sengoku",
              "ja": "千石"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Sengoku"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Mita.Sengoku.Southbound.Weekday",
              "odpt.StationTimetable:Toei.Mita.Sengoku.Southbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Mita.Sengoku.Northbound.Weekday",
              "odpt.StationTimetable:Toei.Mita.Sengoku.Northbound.SaturdayHoliday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102C94",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.654186,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "芝公園",
            "geo:long": 139.74985,
            "owl:sameAs": "odpt.Station:Toei.Mita.Shibakoen",
            "odpt:railway": "odpt.Railway:Toei.Mita",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "I-05",
            "odpt:stationTitle": {
              "en": "Shibakoen",
              "ja": "芝公園"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Shibakoen"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Mita.Shibakoen.Southbound.Weekday",
              "odpt.StationTimetable:Toei.Mita.Shibakoen.Southbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Mita.Shibakoen.Northbound.Weekday",
              "odpt.StationTimetable:Toei.Mita.Shibakoen.Northbound.SaturdayHoliday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CA5",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.777468,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "志村三丁目",
            "geo:long": 139.685751,
            "owl:sameAs": "odpt.Station:Toei.Mita.ShimuraSanchome",
            "odpt:railway": "odpt.Railway:Toei.Mita",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "I-22",
            "odpt:stationTitle": {
              "en": "Shimura-sanchome",
              "ja": "志村三丁目"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.ShimuraSanchome"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Mita.ShimuraSanchome.Southbound.Weekday",
              "odpt.StationTimetable:Toei.Mita.ShimuraSanchome.Southbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Mita.ShimuraSanchome.Northbound.Weekday",
              "odpt.StationTimetable:Toei.Mita.ShimuraSanchome.Northbound.SaturdayHoliday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CA0",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.748772,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "新板橋",
            "geo:long": 139.719808,
            "owl:sameAs": "odpt.Station:Toei.Mita.ShinItabashi",
            "odpt:railway": "odpt.Railway:Toei.Mita",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "I-17",
            "odpt:stationTitle": {
              "en": "Shin-itabashi",
              "ja": "新板橋"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.ShinItabashi"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Mita.ShinItabashi.Southbound.Weekday",
              "odpt.StationTimetable:Toei.Mita.ShinItabashi.Southbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Mita.ShinItabashi.Northbound.Weekday",
              "odpt.StationTimetable:Toei.Mita.ShinItabashi.Northbound.SaturdayHoliday"
            ],
            "odpt:connectingRailway": [
              "odpt.Railway:JR-East.SaikyoKawagoe"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CA9",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.790289,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "新高島平",
            "geo:long": 139.65405,
            "owl:sameAs": "odpt.Station:Toei.Mita.ShinTakashimadaira",
            "odpt:railway": "odpt.Railway:Toei.Mita",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "I-26",
            "odpt:stationTitle": {
              "en": "Shin-takashimadaira",
              "ja": "新高島平"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.ShinTakashimadaira"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Mita.ShinTakashimadaira.Southbound.Weekday",
              "odpt.StationTimetable:Toei.Mita.ShinTakashimadaira.Southbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Mita.ShinTakashimadaira.Northbound.Weekday",
              "odpt.StationTimetable:Toei.Mita.ShinTakashimadaira.Northbound.SaturdayHoliday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CBB",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.68376,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "船堀",
            "geo:long": 139.863955,
            "owl:sameAs": "odpt.Station:Toei.Shinjuku.Funabori",
            "odpt:railway": "odpt.Railway:Toei.Shinjuku",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "S-17",
            "odpt:stationTitle": {
              "en": "Funabori",
              "ja": "船堀"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Funabori"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Shinjuku.Funabori.Westbound.Weekday",
              "odpt.StationTimetable:Toei.Shinjuku.Funabori.Westbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Shinjuku.Funabori.Eastbound.Weekday",
              "odpt.StationTimetable:Toei.Shinjuku.Funabori.Eastbound.SaturdayHoliday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102C92",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.643283,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "白金高輪",
            "geo:long": 139.734344,
            "owl:sameAs": "odpt.Station:Toei.Mita.ShirokaneTakanawa",
            "odpt:railway": "odpt.Railway:Toei.Mita",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "I-03",
            "odpt:stationTitle": {
              "en": "Shirokane-takanawa",
              "ja": "白金高輪"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.ShirokaneTakanawa"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Mita.ShirokaneTakanawa.Southbound.Weekday",
              "odpt.StationTimetable:Toei.Mita.ShirokaneTakanawa.Southbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Mita.ShirokaneTakanawa.Northbound.Weekday",
              "odpt.StationTimetable:Toei.Mita.ShirokaneTakanawa.Northbound.SaturdayHoliday"
            ],
            "odpt:connectingRailway": [
              "odpt.Railway:TokyoMetro.Namboku"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102D10",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.80569,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "舎人",
            "geo:long": 139.770069,
            "owl:sameAs": "odpt.Station:Toei.NipporiToneri.Toneri",
            "odpt:railway": "odpt.Railway:Toei.NipporiToneri",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "NT-12",
            "odpt:stationTitle": {
              "en": "Toneri",
              "ja": "舎人"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Toneri"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.NipporiToneri.Toneri.Inbound.Weekday",
              "odpt.StationTimetable:Toei.NipporiToneri.Toneri.Inbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.NipporiToneri.Toneri.Outbound.Weekday",
              "odpt.StationTimetable:Toei.NipporiToneri.Toneri.Outbound.SaturdayHoliday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102C91",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.637851,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "白金台",
            "geo:long": 139.726007,
            "owl:sameAs": "odpt.Station:Toei.Mita.Shirokanedai",
            "odpt:railway": "odpt.Railway:Toei.Mita",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "I-02",
            "odpt:stationTitle": {
              "en": "Shirokanedai",
              "ja": "白金台"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Shirokanedai"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Mita.Shirokanedai.Southbound.Weekday",
              "odpt.StationTimetable:Toei.Mita.Shirokanedai.Southbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Mita.Shirokanedai.Northbound.Weekday",
              "odpt.StationTimetable:Toei.Mita.Shirokanedai.Northbound.SaturdayHoliday"
            ],
            "odpt:connectingRailway": [
              "odpt.Railway:TokyoMetro.Namboku"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102C9E",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.733793,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "巣鴨",
            "geo:long": 139.738154,
            "owl:sameAs": "odpt.Station:Toei.Mita.Sugamo",
            "odpt:railway": "odpt.Railway:Toei.Mita",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "I-15",
            "odpt:stationTitle": {
              "en": "Sugamo",
              "ja": "巣鴨"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Sugamo"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Mita.Sugamo.Southbound.Weekday",
              "odpt.StationTimetable:Toei.Mita.Sugamo.Southbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Mita.Sugamo.Northbound.Weekday",
              "odpt.StationTimetable:Toei.Mita.Sugamo.Northbound.SaturdayHoliday"
            ],
            "odpt:connectingRailway": [
              "odpt.Railway:JR-East.Yamanote"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102C9A",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.70346,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "水道橋",
            "geo:long": 139.755147,
            "owl:sameAs": "odpt.Station:Toei.Mita.Suidobashi",
            "odpt:railway": "odpt.Railway:Toei.Mita",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "I-11",
            "odpt:stationTitle": {
              "en": "Suidobashi",
              "ja": "水道橋"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Suidobashi"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Mita.Suidobashi.Southbound.Weekday",
              "odpt.StationTimetable:Toei.Mita.Suidobashi.Southbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Mita.Suidobashi.Northbound.Weekday",
              "odpt.StationTimetable:Toei.Mita.Suidobashi.Northbound.SaturdayHoliday"
            ],
            "odpt:connectingRailway": [
              "odpt.Railway:JR-East.ChuoSobuLocal"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CA8",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.788908,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "高島平",
            "geo:long": 139.661361,
            "owl:sameAs": "odpt.Station:Toei.Mita.Takashimadaira",
            "odpt:railway": "odpt.Railway:Toei.Mita",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "I-25",
            "odpt:stationTitle": {
              "en": "Takashimadaira",
              "ja": "高島平"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Takashimadaira"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Mita.Takashimadaira.Southbound.Weekday",
              "odpt.StationTimetable:Toei.Mita.Takashimadaira.Southbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Mita.Takashimadaira.Northbound.Weekday",
              "odpt.StationTimetable:Toei.Mita.Takashimadaira.Northbound.SaturdayHoliday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102C96",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.669344,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "内幸町",
            "geo:long": 139.75533,
            "owl:sameAs": "odpt.Station:Toei.Mita.Uchisaiwaicho",
            "odpt:railway": "odpt.Railway:Toei.Mita",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "I-07",
            "odpt:stationTitle": {
              "en": "Uchisaiwaicho",
              "ja": "内幸町"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Uchisaiwaicho"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Mita.Uchisaiwaicho.Southbound.Weekday",
              "odpt.StationTimetable:Toei.Mita.Uchisaiwaicho.Southbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Mita.Uchisaiwaicho.Northbound.Weekday",
              "odpt.StationTimetable:Toei.Mita.Uchisaiwaicho.Northbound.SaturdayHoliday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102D09",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.754655,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "足立小台",
            "geo:long": 139.770376,
            "owl:sameAs": "odpt.Station:Toei.NipporiToneri.AdachiOdai",
            "odpt:railway": "odpt.Railway:Toei.NipporiToneri",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "NT-05",
            "odpt:stationTitle": {
              "en": "Adachi-odai",
              "ja": "足立小台"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.AdachiOdai"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.NipporiToneri.AdachiOdai.Inbound.Weekday",
              "odpt.StationTimetable:Toei.NipporiToneri.AdachiOdai.Inbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.NipporiToneri.AdachiOdai.Outbound.Weekday",
              "odpt.StationTimetable:Toei.NipporiToneri.AdachiOdai.Outbound.SaturdayHoliday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CBC",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.685987,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "一之江",
            "geo:long": 139.882586,
            "owl:sameAs": "odpt.Station:Toei.Shinjuku.Ichinoe",
            "odpt:railway": "odpt.Railway:Toei.Shinjuku",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "S-18",
            "odpt:stationTitle": {
              "en": "Ichinoe",
              "ja": "一之江"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Ichinoe"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Shinjuku.Ichinoe.Westbound.Weekday",
              "odpt.StationTimetable:Toei.Shinjuku.Ichinoe.Westbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Shinjuku.Ichinoe.Eastbound.Weekday",
              "odpt.StationTimetable:Toei.Shinjuku.Ichinoe.Eastbound.SaturdayHoliday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102D07",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.742868,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "赤土小学校前",
            "geo:long": 139.769025,
            "owl:sameAs": "odpt.Station:Toei.NipporiToneri.AkadoShogakkomae",
            "odpt:railway": "odpt.Railway:Toei.NipporiToneri",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "NT-03",
            "odpt:stationTitle": {
              "en": "Akado-shogakkomae",
              "ja": "赤土小学校前"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.AkadoShogakkomae"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.NipporiToneri.AkadoShogakkomae.Inbound.Weekday",
              "odpt.StationTimetable:Toei.NipporiToneri.AkadoShogakkomae.Inbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.NipporiToneri.AkadoShogakkomae.Outbound.Weekday",
              "odpt.StationTimetable:Toei.NipporiToneri.AkadoShogakkomae.Outbound.SaturdayHoliday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102D0C",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.773954,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "江北",
            "geo:long": 139.77029,
            "owl:sameAs": "odpt.Station:Toei.NipporiToneri.Kohoku",
            "odpt:railway": "odpt.Railway:Toei.NipporiToneri",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "NT-08",
            "odpt:stationTitle": {
              "en": "Kohoku",
              "ja": "江北"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Kohoku"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.NipporiToneri.Kohoku.Inbound.Weekday",
              "odpt.StationTimetable:Toei.NipporiToneri.Kohoku.Inbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.NipporiToneri.Kohoku.Outbound.Weekday",
              "odpt.StationTimetable:Toei.NipporiToneri.Kohoku.Outbound.SaturdayHoliday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102D0B",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.768351,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "高野",
            "geo:long": 139.770692,
            "owl:sameAs": "odpt.Station:Toei.NipporiToneri.Koya",
            "odpt:railway": "odpt.Railway:Toei.NipporiToneri",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "NT-07",
            "odpt:stationTitle": {
              "en": "Koya",
              "ja": "高野"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Koya"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.NipporiToneri.Koya.Inbound.Weekday",
              "odpt.StationTimetable:Toei.NipporiToneri.Koya.Inbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.NipporiToneri.Koya.Outbound.Weekday",
              "odpt.StationTimetable:Toei.NipporiToneri.Koya.Outbound.SaturdayHoliday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CB4",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.688601,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "浜町",
            "geo:long": 139.787725,
            "owl:sameAs": "odpt.Station:Toei.Shinjuku.Hamacho",
            "odpt:railway": "odpt.Railway:Toei.Shinjuku",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "S-10",
            "odpt:stationTitle": {
              "en": "Hamacho",
              "ja": "浜町"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Hamacho"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Shinjuku.Hamacho.Westbound.Weekday",
              "odpt.StationTimetable:Toei.Shinjuku.Hamacho.Westbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Shinjuku.Hamacho.Eastbound.Weekday",
              "odpt.StationTimetable:Toei.Shinjuku.Hamacho.Eastbound.SaturdayHoliday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102D08",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.748513,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "熊野前",
            "geo:long": 139.769828,
            "owl:sameAs": "odpt.Station:Toei.NipporiToneri.Kumanomae",
            "odpt:railway": "odpt.Railway:Toei.NipporiToneri",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "NT-04",
            "odpt:stationTitle": {
              "en": "Kumanomae",
              "ja": "熊野前"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Kumanomae"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.NipporiToneri.Kumanomae.Inbound.Weekday",
              "odpt.StationTimetable:Toei.NipporiToneri.Kumanomae.Inbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.NipporiToneri.Kumanomae.Outbound.Weekday",
              "odpt.StationTimetable:Toei.NipporiToneri.Kumanomae.Outbound.SaturdayHoliday"
            ],
            "odpt:connectingRailway": [
              "odpt.Railway:Toei.Arakawa"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102D11",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.814541,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "見沼代親水公園",
            "geo:long": 139.770707,
            "owl:sameAs": "odpt.Station:Toei.NipporiToneri.MinumadaiShinsuikoen",
            "odpt:railway": "odpt.Railway:Toei.NipporiToneri",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "NT-13",
            "odpt:stationTitle": {
              "en": "Minumadai-shinsuikoen",
              "ja": "見沼代親水公園"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.MinumadaiShinsuikoen"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.NipporiToneri.MinumadaiShinsuikoen.Inbound.Weekday",
              "odpt.StationTimetable:Toei.NipporiToneri.MinumadaiShinsuikoen.Inbound.SaturdayHoliday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CBE",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.706022,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "篠崎",
            "geo:long": 139.903796,
            "owl:sameAs": "odpt.Station:Toei.Shinjuku.Shinozaki",
            "odpt:railway": "odpt.Railway:Toei.Shinjuku",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "S-20",
            "odpt:stationTitle": {
              "en": "Shinozaki",
              "ja": "篠崎"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Shinozaki"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Shinjuku.Shinozaki.Westbound.Weekday",
              "odpt.StationTimetable:Toei.Shinjuku.Shinozaki.Westbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Shinjuku.Shinozaki.Eastbound.Weekday",
              "odpt.StationTimetable:Toei.Shinjuku.Shinozaki.Eastbound.SaturdayHoliday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102D05",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.728793,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "日暮里",
            "geo:long": 139.771121,
            "owl:sameAs": "odpt.Station:Toei.NipporiToneri.Nippori",
            "odpt:railway": "odpt.Railway:Toei.NipporiToneri",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "NT-01",
            "odpt:stationTitle": {
              "en": "Nippori",
              "ja": "日暮里"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Nippori"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.NipporiToneri.Nippori.Outbound.Weekday",
              "odpt.StationTimetable:Toei.NipporiToneri.Nippori.Outbound.SaturdayHoliday"
            ],
            "odpt:connectingRailway": [
              "odpt.Railway:JR-East.JobanRapid",
              "odpt.Railway:JR-East.KeihinTohokuNegishi",
              "odpt.Railway:JR-East.Yamanote",
              "odpt.Railway:Keisei.Main"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CD5",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.654985,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "赤羽橋",
            "geo:long": 139.743989,
            "owl:sameAs": "odpt.Station:Toei.Oedo.Akabanebashi",
            "odpt:railway": "odpt.Railway:Toei.Oedo",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "E-21",
            "odpt:stationTitle": {
              "en": "Akabanebashi",
              "ja": "赤羽橋"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Akabanebashi"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Oedo.Akabanebashi.InnerLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.Akabanebashi.InnerLoop.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Oedo.Akabanebashi.OuterLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.Akabanebashi.OuterLoop.SaturdayHoliday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102D06",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.733739,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "西日暮里",
            "geo:long": 139.768169,
            "owl:sameAs": "odpt.Station:Toei.NipporiToneri.NishiNippori",
            "odpt:railway": "odpt.Railway:Toei.NipporiToneri",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "NT-02",
            "odpt:stationTitle": {
              "en": "Nishi-nippori",
              "ja": "西日暮里"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.NishiNippori"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.NipporiToneri.NishiNippori.Inbound.Weekday",
              "odpt.StationTimetable:Toei.NipporiToneri.NishiNippori.Inbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.NipporiToneri.NishiNippori.Outbound.Weekday",
              "odpt.StationTimetable:Toei.NipporiToneri.NishiNippori.Outbound.SaturdayHoliday"
            ],
            "odpt:connectingRailway": [
              "odpt.Railway:JR-East.KeihinTohokuNegishi",
              "odpt.Railway:JR-East.Yamanote",
              "odpt.Railway:TokyoMetro.Chiyoda"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102D0D",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.78151,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "西新井大師西",
            "geo:long": 139.770077,
            "owl:sameAs": "odpt.Station:Toei.NipporiToneri.NishiaraidaishiNishi",
            "odpt:railway": "odpt.Railway:Toei.NipporiToneri",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "NT-09",
            "odpt:stationTitle": {
              "en": "Nishiaraidaishi-nishi",
              "ja": "西新井大師西"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.NishiaraidaishiNishi"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.NipporiToneri.NishiaraidaishiNishi.Inbound.Weekday",
              "odpt.StationTimetable:Toei.NipporiToneri.NishiaraidaishiNishi.Inbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.NipporiToneri.NishiaraidaishiNishi.Outbound.Weekday",
              "odpt.StationTimetable:Toei.NipporiToneri.NishiaraidaishiNishi.Outbound.SaturdayHoliday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102D0A",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.763906,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "扇大橋",
            "geo:long": 139.770798,
            "owl:sameAs": "odpt.Station:Toei.NipporiToneri.OgiOhashi",
            "odpt:railway": "odpt.Railway:Toei.NipporiToneri",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "NT-06",
            "odpt:stationTitle": {
              "en": "Ogi-ohashi",
              "ja": "扇大橋"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.OgiOhashi"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.NipporiToneri.OgiOhashi.Inbound.Weekday",
              "odpt.StationTimetable:Toei.NipporiToneri.OgiOhashi.Inbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.NipporiToneri.OgiOhashi.Outbound.Weekday",
              "odpt.StationTimetable:Toei.NipporiToneri.OgiOhashi.Outbound.SaturdayHoliday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102D0F",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.796384,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "舎人公園",
            "geo:long": 139.770159,
            "owl:sameAs": "odpt.Station:Toei.NipporiToneri.ToneriKoen",
            "odpt:railway": "odpt.Railway:Toei.NipporiToneri",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "NT-11",
            "odpt:stationTitle": {
              "en": "Toneri-koen",
              "ja": "舎人公園"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.ToneriKoen"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.NipporiToneri.ToneriKoen.Inbound.Weekday",
              "odpt.StationTimetable:Toei.NipporiToneri.ToneriKoen.Inbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.NipporiToneri.ToneriKoen.Outbound.Weekday",
              "odpt.StationTimetable:Toei.NipporiToneri.ToneriKoen.Outbound.SaturdayHoliday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102D0E",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.788787,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "谷在家",
            "geo:long": 139.770036,
            "owl:sameAs": "odpt.Station:Toei.NipporiToneri.Yazaike",
            "odpt:railway": "odpt.Railway:Toei.NipporiToneri",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "NT-10",
            "odpt:stationTitle": {
              "en": "Yazaike",
              "ja": "谷在家"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Yazaike"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.NipporiToneri.Yazaike.Inbound.Weekday",
              "odpt.StationTimetable:Toei.NipporiToneri.Yazaike.Inbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.NipporiToneri.Yazaike.Outbound.Weekday",
              "odpt.StationTimetable:Toei.NipporiToneri.Yazaike.Outbound.SaturdayHoliday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CD8",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.673067,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "青山一丁目",
            "geo:long": 139.723925,
            "owl:sameAs": "odpt.Station:Toei.Oedo.AoyamaItchome",
            "odpt:railway": "odpt.Railway:Toei.Oedo",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "E-24",
            "odpt:stationTitle": {
              "en": "Aoyama-itchome",
              "ja": "青山一丁目"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.AoyamaItchome"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Oedo.AoyamaItchome.InnerLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.AoyamaItchome.InnerLoop.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Oedo.AoyamaItchome.OuterLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.AoyamaItchome.OuterLoop.SaturdayHoliday"
            ],
            "odpt:connectingRailway": [
              "odpt.Railway:TokyoMetro.Ginza",
              "odpt.Railway:TokyoMetro.Hanzomon"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CD6",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.656448,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "麻布十番",
            "geo:long": 139.73633,
            "owl:sameAs": "odpt.Station:Toei.Oedo.AzabuJuban",
            "odpt:railway": "odpt.Railway:Toei.Oedo",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "E-22",
            "odpt:stationTitle": {
              "en": "Azabu-juban",
              "ja": "麻布十番"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.AzabuJuban"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Oedo.AzabuJuban.InnerLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.AzabuJuban.InnerLoop.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Oedo.AzabuJuban.OuterLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.AzabuJuban.OuterLoop.SaturdayHoliday"
            ],
            "odpt:connectingRailway": [
              "odpt.Railway:TokyoMetro.Namboku"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CC7",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.708493,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "春日",
            "geo:long": 139.752487,
            "owl:sameAs": "odpt.Station:Toei.Oedo.Kasuga",
            "odpt:railway": "odpt.Railway:Toei.Oedo",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "E-07",
            "odpt:stationTitle": {
              "en": "Kasuga",
              "ja": "春日"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Oedo.Kasuga"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Oedo.Kasuga.InnerLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.Kasuga.InnerLoop.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Oedo.Kasuga.OuterLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.Kasuga.OuterLoop.SaturdayHoliday"
            ],
            "odpt:connectingRailway": [
              "odpt.Railway:Toei.Mita",
              "odpt.Railway:TokyoMetro.Marunouchi",
              "odpt.Railway:TokyoMetro.Namboku"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CD4",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.656671,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "大門",
            "geo:long": 139.755696,
            "owl:sameAs": "odpt.Station:Toei.Oedo.Daimon",
            "odpt:railway": "odpt.Railway:Toei.Oedo",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "E-20",
            "odpt:stationTitle": {
              "en": "Daimon",
              "ja": "大門"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Oedo.Daimon"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Oedo.Daimon.InnerLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.Daimon.InnerLoop.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Oedo.Daimon.OuterLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.Daimon.OuterLoop.SaturdayHoliday"
            ],
            "odpt:connectingRailway": [
              "odpt.Railway:JR-East.KeihinTohokuNegishi",
              "odpt.Railway:JR-East.Yamanote",
              "odpt.Railway:Toei.Asakusa",
              "odpt.Railway:TokyoMonorail.HanedaAirport"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CDF",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.70716,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "東中野",
            "geo:long": 139.683112,
            "owl:sameAs": "odpt.Station:Toei.Oedo.HigashiNakano",
            "odpt:railway": "odpt.Railway:Toei.Oedo",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "E-31",
            "odpt:stationTitle": {
              "en": "Higashi-nakano",
              "ja": "東中野"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.HigashiNakano"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Oedo.HigashiNakano.InnerLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.HigashiNakano.InnerLoop.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Oedo.HigashiNakano.OuterLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.HigashiNakano.OuterLoop.SaturdayHoliday"
            ],
            "odpt:connectingRailway": [
              "odpt.Railway:JR-East.ChuoSobuLocal"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CC2",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.697957,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "東新宿",
            "geo:long": 139.707434,
            "owl:sameAs": "odpt.Station:Toei.Oedo.HigashiShinjuku",
            "odpt:railway": "odpt.Railway:Toei.Oedo",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "E-02",
            "odpt:stationTitle": {
              "en": "Higashi-shinjuku",
              "ja": "東新宿"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.HigashiShinjuku"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Oedo.HigashiShinjuku.InnerLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.HigashiShinjuku.InnerLoop.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Oedo.HigashiShinjuku.OuterLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.HigashiShinjuku.OuterLoop.SaturdayHoliday"
            ],
            "odpt:connectingRailway": [
              "odpt.Railway:TokyoMetro.Fukutoshin"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CC8",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.70751,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "本郷三丁目",
            "geo:long": 139.760524,
            "owl:sameAs": "odpt.Station:Toei.Oedo.HongoSanchome",
            "odpt:railway": "odpt.Railway:Toei.Oedo",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "E-08",
            "odpt:stationTitle": {
              "en": "Hongo-sanchome",
              "ja": "本郷三丁目"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.HongoSanchome"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Oedo.HongoSanchome.InnerLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.HongoSanchome.InnerLoop.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Oedo.HongoSanchome.OuterLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.HongoSanchome.OuterLoop.SaturdayHoliday"
            ],
            "odpt:connectingRailway": [
              "odpt.Railway:TokyoMetro.Marunouchi"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CC6",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.702952,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "飯田橋",
            "geo:long": 139.745257,
            "owl:sameAs": "odpt.Station:Toei.Oedo.Iidabashi",
            "odpt:railway": "odpt.Railway:Toei.Oedo",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "E-06",
            "odpt:stationTitle": {
              "en": "Iidabashi",
              "ja": "飯田橋"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Iidabashi"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Oedo.Iidabashi.InnerLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.Iidabashi.InnerLoop.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Oedo.Iidabashi.OuterLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.Iidabashi.OuterLoop.SaturdayHoliday"
            ],
            "odpt:connectingRailway": [
              "odpt.Railway:JR-East.ChuoSobuLocal",
              "odpt.Railway:TokyoMetro.Namboku",
              "odpt.Railway:TokyoMetro.Tozai",
              "odpt.Railway:TokyoMetro.Yurakucho"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CD1",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.658934,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "勝どき",
            "geo:long": 139.777138,
            "owl:sameAs": "odpt.Station:Toei.Oedo.Kachidoki",
            "odpt:railway": "odpt.Railway:Toei.Oedo",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "E-17",
            "odpt:stationTitle": {
              "en": "Kachidoki",
              "ja": "勝どき"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Kachidoki"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Oedo.Kachidoki.InnerLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.Kachidoki.InnerLoop.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Oedo.Kachidoki.OuterLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.Kachidoki.OuterLoop.SaturdayHoliday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CCE",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.682355,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "清澄白河",
            "geo:long": 139.798758,
            "owl:sameAs": "odpt.Station:Toei.Oedo.KiyosumiShirakawa",
            "odpt:railway": "odpt.Railway:Toei.Oedo",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "E-14",
            "odpt:stationTitle": {
              "en": "Kiyosumi-shirakawa",
              "ja": "清澄白河"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.KiyosumiShirakawa"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Oedo.KiyosumiShirakawa.InnerLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.KiyosumiShirakawa.InnerLoop.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Oedo.KiyosumiShirakawa.OuterLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.KiyosumiShirakawa.OuterLoop.SaturdayHoliday"
            ],
            "odpt:connectingRailway": [
              "odpt.Railway:TokyoMetro.Hanzomon"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CD9",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.679896,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "国立競技場",
            "geo:long": 139.714667,
            "owl:sameAs": "odpt.Station:Toei.Oedo.KokuritsuKyogijo",
            "odpt:railway": "odpt.Railway:Toei.Oedo",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "E-25",
            "odpt:stationTitle": {
              "en": "Kokuritsu-kyogijo",
              "ja": "国立競技場"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.KokuritsuKyogijo"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Oedo.KokuritsuKyogijo.InnerLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.KokuritsuKyogijo.InnerLoop.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Oedo.KokuritsuKyogijo.OuterLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.KokuritsuKyogijo.OuterLoop.SaturdayHoliday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CCB",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.705587,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "蔵前",
            "geo:long": 139.792244,
            "owl:sameAs": "odpt.Station:Toei.Oedo.Kuramae",
            "odpt:railway": "odpt.Railway:Toei.Oedo",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "E-11",
            "odpt:stationTitle": {
              "en": "Kuramae",
              "ja": "蔵前"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Oedo.Kuramae"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Oedo.Kuramae.InnerLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.Kuramae.InnerLoop.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Oedo.Kuramae.OuterLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.Kuramae.OuterLoop.SaturdayHoliday"
            ],
            "odpt:connectingRailway": [
              "odpt.Railway:Toei.Asakusa"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CCF",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.672772,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "門前仲町",
            "geo:long": 139.795124,
            "owl:sameAs": "odpt.Station:Toei.Oedo.MonzenNakacho",
            "odpt:railway": "odpt.Railway:Toei.Oedo",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "E-15",
            "odpt:stationTitle": {
              "en": "Monzen-nakacho",
              "ja": "門前仲町"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.MonzenNakacho"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Oedo.MonzenNakacho.InnerLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.MonzenNakacho.InnerLoop.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Oedo.MonzenNakacho.OuterLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.MonzenNakacho.OuterLoop.SaturdayHoliday"
            ],
            "odpt:connectingRailway": [
              "odpt.Railway:TokyoMetro.Tozai"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CCD",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.687926,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "森下",
            "geo:long": 139.798251,
            "owl:sameAs": "odpt.Station:Toei.Oedo.Morishita",
            "odpt:railway": "odpt.Railway:Toei.Oedo",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "E-13",
            "odpt:stationTitle": {
              "en": "Morishita",
              "ja": "森下"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Oedo.Morishita"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Oedo.Morishita.InnerLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.Morishita.InnerLoop.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Oedo.Morishita.OuterLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.Morishita.OuterLoop.SaturdayHoliday"
            ],
            "odpt:connectingRailway": [
              "odpt.Railway:Toei.Shinjuku"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CE0",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.713935,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "中井",
            "geo:long": 139.686296,
            "owl:sameAs": "odpt.Station:Toei.Oedo.Nakai",
            "odpt:railway": "odpt.Railway:Toei.Oedo",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "E-32",
            "odpt:stationTitle": {
              "en": "Nakai",
              "ja": "中井"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Nakai"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Oedo.Nakai.InnerLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.Nakai.InnerLoop.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Oedo.Nakai.OuterLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.Nakai.OuterLoop.SaturdayHoliday"
            ],
            "odpt:connectingRailway": [
              "odpt.Railway:Seibu.Shinjuku"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CCC",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.696807,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "両国",
            "geo:long": 139.797469,
            "owl:sameAs": "odpt.Station:Toei.Oedo.Ryogoku",
            "odpt:railway": "odpt.Railway:Toei.Oedo",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "E-12",
            "odpt:stationTitle": {
              "en": "Ryogoku",
              "ja": "両国"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Ryogoku"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Oedo.Ryogoku.InnerLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.Ryogoku.InnerLoop.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Oedo.Ryogoku.OuterLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.Ryogoku.OuterLoop.SaturdayHoliday"
            ],
            "odpt:connectingRailway": [
              "odpt.Railway:JR-East.ChuoSobuLocal"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CDE",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.697887,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "中野坂上",
            "geo:long": 139.682899,
            "owl:sameAs": "odpt.Station:Toei.Oedo.NakanoSakaue",
            "odpt:railway": "odpt.Railway:Toei.Oedo",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "E-30",
            "odpt:stationTitle": {
              "en": "Nakano-sakaue",
              "ja": "中野坂上"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.NakanoSakaue"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Oedo.NakanoSakaue.InnerLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.NakanoSakaue.InnerLoop.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Oedo.NakanoSakaue.OuterLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.NakanoSakaue.OuterLoop.SaturdayHoliday"
            ],
            "odpt:connectingRailway": [
              "odpt.Railway:TokyoMetro.Marunouchi",
              "odpt.Railway:TokyoMetro.MarunouchiBranch"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CE5",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.75141,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "練馬春日町",
            "geo:long": 139.6403,
            "owl:sameAs": "odpt.Station:Toei.Oedo.NerimaKasugacho",
            "odpt:railway": "odpt.Railway:Toei.Oedo",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "E-37",
            "odpt:stationTitle": {
              "en": "Nerima-kasugacho",
              "ja": "練馬春日町"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.NerimaKasugacho"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Oedo.NerimaKasugacho.InnerLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.NerimaKasugacho.InnerLoop.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Oedo.NerimaKasugacho.OuterLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.NerimaKasugacho.OuterLoop.SaturdayHoliday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CD0",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.663757,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "月島",
            "geo:long": 139.783912,
            "owl:sameAs": "odpt.Station:Toei.Oedo.Tsukishima",
            "odpt:railway": "odpt.Railway:Toei.Oedo",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "E-16",
            "odpt:stationTitle": {
              "en": "Tsukishima",
              "ja": "月島"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Tsukishima"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Oedo.Tsukishima.InnerLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.Tsukishima.InnerLoop.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Oedo.Tsukishima.OuterLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.Tsukishima.OuterLoop.SaturdayHoliday"
            ],
            "odpt:connectingRailway": [
              "odpt.Railway:TokyoMetro.Yurakucho"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CB9",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.689752,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "大島",
            "geo:long": 139.834705,
            "owl:sameAs": "odpt.Station:Toei.Shinjuku.Ojima",
            "odpt:railway": "odpt.Railway:Toei.Shinjuku",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "S-15",
            "odpt:stationTitle": {
              "en": "Ojima",
              "ja": "大島"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Ojima"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Shinjuku.Ojima.Westbound.Weekday",
              "odpt.StationTimetable:Toei.Shinjuku.Ojima.Westbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Shinjuku.Ojima.Eastbound.Weekday",
              "odpt.StationTimetable:Toei.Shinjuku.Ojima.Eastbound.SaturdayHoliday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CE3",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.737411,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "練馬",
            "geo:long": 139.654762,
            "owl:sameAs": "odpt.Station:Toei.Oedo.Nerima",
            "odpt:railway": "odpt.Railway:Toei.Oedo",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "E-35",
            "odpt:stationTitle": {
              "en": "Nerima",
              "ja": "練馬"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Nerima"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Oedo.Nerima.InnerLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.Nerima.InnerLoop.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Oedo.Nerima.OuterLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.Nerima.OuterLoop.SaturdayHoliday"
            ],
            "odpt:connectingRailway": [
              "odpt.Railway:Seibu.Ikebukuro",
              "odpt.Railway:Seibu.SeibuYurakucho",
              "odpt.Railway:Seibu.Toshima"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CDD",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.689892,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "西新宿五丁目",
            "geo:long": 139.684545,
            "owl:sameAs": "odpt.Station:Toei.Oedo.NishiShinjukuGochome",
            "odpt:railway": "odpt.Railway:Toei.Oedo",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "E-29",
            "odpt:stationTitle": {
              "en": "Nishi-shinjuku-gochome",
              "ja": "西新宿五丁目"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.NishiShinjukuGochome"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Oedo.NishiShinjukuGochome.InnerLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.NishiShinjukuGochome.InnerLoop.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Oedo.NishiShinjukuGochome.OuterLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.NishiShinjukuGochome.OuterLoop.SaturdayHoliday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CE1",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.723435,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "落合南長崎",
            "geo:long": 139.683389,
            "owl:sameAs": "odpt.Station:Toei.Oedo.OchiaiMinamiNagasaki",
            "odpt:railway": "odpt.Railway:Toei.Oedo",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "E-33",
            "odpt:stationTitle": {
              "en": "Ochiai-minami-nagasaki",
              "ja": "落合南長崎"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.OchiaiMinamiNagasaki"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Oedo.OchiaiMinamiNagasaki.InnerLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.OchiaiMinamiNagasaki.InnerLoop.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Oedo.OchiaiMinamiNagasaki.OuterLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.OchiaiMinamiNagasaki.OuterLoop.SaturdayHoliday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CD7",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.664106,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "六本木",
            "geo:long": 139.731354,
            "owl:sameAs": "odpt.Station:Toei.Oedo.Roppongi",
            "odpt:railway": "odpt.Railway:Toei.Oedo",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "E-23",
            "odpt:stationTitle": {
              "en": "Roppongi",
              "ja": "六本木"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Roppongi"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Oedo.Roppongi.InnerLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.Roppongi.InnerLoop.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Oedo.Roppongi.OuterLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.Roppongi.OuterLoop.SaturdayHoliday"
            ],
            "odpt:connectingRailway": [
              "odpt.Railway:TokyoMetro.Hibiya"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CE2",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.732579,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "新江古田",
            "geo:long": 139.670498,
            "owl:sameAs": "odpt.Station:Toei.Oedo.ShinEgota",
            "odpt:railway": "odpt.Railway:Toei.Oedo",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "E-34",
            "odpt:stationTitle": {
              "en": "Shin-egota",
              "ja": "新江古田"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.ShinEgota"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Oedo.ShinEgota.InnerLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.ShinEgota.InnerLoop.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Oedo.ShinEgota.OuterLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.ShinEgota.OuterLoop.SaturdayHoliday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CCA",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.707009,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "新御徒町",
            "geo:long": 139.782166,
            "owl:sameAs": "odpt.Station:Toei.Oedo.ShinOkachimachi",
            "odpt:railway": "odpt.Railway:Toei.Oedo",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "E-10",
            "odpt:stationTitle": {
              "en": "Shin-okachimachi",
              "ja": "新御徒町"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.ShinOkachimachi"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Oedo.ShinOkachimachi.InnerLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.ShinOkachimachi.InnerLoop.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Oedo.ShinOkachimachi.OuterLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.ShinOkachimachi.OuterLoop.SaturdayHoliday"
            ],
            "odpt:connectingRailway": [
              "odpt.Railway:MIR.TsukubaExpress"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CC1",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.693367,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "新宿西口",
            "geo:long": 139.699121,
            "owl:sameAs": "odpt.Station:Toei.Oedo.ShinjukuNishiguchi",
            "odpt:railway": "odpt.Railway:Toei.Oedo",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "E-01",
            "odpt:stationTitle": {
              "en": "Shinjuku-nishiguchi",
              "ja": "新宿西口"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.ShinjukuNishiguchi"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Oedo.ShinjukuNishiguchi.InnerLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.ShinjukuNishiguchi.InnerLoop.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Oedo.ShinjukuNishiguchi.OuterLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.ShinjukuNishiguchi.OuterLoop.SaturdayHoliday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CDB",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.688462,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "新宿",
            "geo:long": 139.699019,
            "owl:sameAs": "odpt.Station:Toei.Oedo.Shinjuku",
            "odpt:railway": "odpt.Railway:Toei.Oedo",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "E-27",
            "odpt:stationTitle": {
              "en": "Shinjuku",
              "ja": "新宿"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Oedo.Shinjuku"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Oedo.Shinjuku.InnerLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.Shinjuku.InnerLoop.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Oedo.Shinjuku.OuterLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.Shinjuku.OuterLoop.SaturdayHoliday"
            ],
            "odpt:connectingRailway": [
              "odpt.Railway:JR-East.ChuoRapid",
              "odpt.Railway:JR-East.ChuoSobuLocal",
              "odpt.Railway:JR-East.SaikyoKawagoe",
              "odpt.Railway:JR-East.ShonanShinjuku",
              "odpt.Railway:JR-East.Yamanote",
              "odpt.Railway:Keio.Keio",
              "odpt.Railway:Keio.KeioNew",
              "odpt.Railway:Odakyu.Odawara",
              "odpt.Railway:Seibu.Shinjuku",
              "odpt.Railway:Toei.Shinjuku",
              "odpt.Railway:TokyoMetro.Marunouchi"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CD3",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.663193,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "汐留",
            "geo:long": 139.760225,
            "owl:sameAs": "odpt.Station:Toei.Oedo.Shiodome",
            "odpt:railway": "odpt.Railway:Toei.Oedo",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "E-19",
            "odpt:stationTitle": {
              "en": "Shiodome",
              "ja": "汐留"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Shiodome"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Oedo.Shiodome.InnerLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.Shiodome.InnerLoop.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Oedo.Shiodome.OuterLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.Shiodome.OuterLoop.SaturdayHoliday"
            ],
            "odpt:connectingRailway": [
              "odpt.Railway:Yurikamome.Yurikamome"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CC0",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.690607,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "都庁前",
            "geo:long": 139.692677,
            "owl:sameAs": "odpt.Station:Toei.Oedo.Tochomae",
            "odpt:railway": "odpt.Railway:Toei.Oedo",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "E-28",
            "odpt:stationTitle": {
              "en": "Tochomae",
              "ja": "都庁前"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Tochomae"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Oedo.Tochomae.InnerLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.Tochomae.InnerLoop.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Oedo.Tochomae.OuterLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.Tochomae.OuterLoop.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Oedo.Tochomae.Toei.Hikarigaoka.Weekday",
              "odpt.StationTimetable:Toei.Oedo.Tochomae.Toei.Hikarigaoka.SaturdayHoliday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CE4",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.741711,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "豊島園",
            "geo:long": 139.649116,
            "owl:sameAs": "odpt.Station:Toei.Oedo.Toshimaen",
            "odpt:railway": "odpt.Railway:Toei.Oedo",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "E-36",
            "odpt:stationTitle": {
              "en": "Toshimaen",
              "ja": "豊島園"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Toshimaen"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Oedo.Toshimaen.InnerLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.Toshimaen.InnerLoop.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Oedo.Toshimaen.OuterLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.Toshimaen.OuterLoop.SaturdayHoliday"
            ],
            "odpt:connectingRailway": [
              "odpt.Railway:Seibu.Toshima"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CD2",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.664919,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "築地市場",
            "geo:long": 139.766929,
            "owl:sameAs": "odpt.Station:Toei.Oedo.Tsukijishijo",
            "odpt:railway": "odpt.Railway:Toei.Oedo",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "E-18",
            "odpt:stationTitle": {
              "en": "Tsukijishijo",
              "ja": "築地市場"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Tsukijishijo"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Oedo.Tsukijishijo.InnerLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.Tsukijishijo.InnerLoop.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Oedo.Tsukijishijo.OuterLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.Tsukijishijo.OuterLoop.SaturdayHoliday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CB3",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.69193,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "馬喰横山",
            "geo:long": 139.783006,
            "owl:sameAs": "odpt.Station:Toei.Shinjuku.BakuroYokoyama",
            "odpt:railway": "odpt.Railway:Toei.Shinjuku",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "S-09",
            "odpt:stationTitle": {
              "en": "Bakuro-yokoyama",
              "ja": "馬喰横山"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.BakuroYokoyama"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Shinjuku.BakuroYokoyama.Westbound.Weekday",
              "odpt.StationTimetable:Toei.Shinjuku.BakuroYokoyama.Westbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Shinjuku.BakuroYokoyama.Eastbound.Weekday",
              "odpt.StationTimetable:Toei.Shinjuku.BakuroYokoyama.Eastbound.SaturdayHoliday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CC9",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.707949,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "上野御徒町",
            "geo:long": 139.773351,
            "owl:sameAs": "odpt.Station:Toei.Oedo.UenoOkachimachi",
            "odpt:railway": "odpt.Railway:Toei.Oedo",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "E-09",
            "odpt:stationTitle": {
              "en": "Ueno-okachimachi",
              "ja": "上野御徒町"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.UenoOkachimachi"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Oedo.UenoOkachimachi.InnerLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.UenoOkachimachi.InnerLoop.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Oedo.UenoOkachimachi.OuterLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.UenoOkachimachi.OuterLoop.SaturdayHoliday"
            ],
            "odpt:connectingRailway": [
              "odpt.Railway:JR-East.KeihinTohokuNegishi",
              "odpt.Railway:JR-East.Yamanote",
              "odpt.Railway:TokyoMetro.Ginza",
              "odpt.Railway:TokyoMetro.Hibiya"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CC5",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.700911,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "牛込神楽坂",
            "geo:long": 139.735894,
            "owl:sameAs": "odpt.Station:Toei.Oedo.UshigomeKagurazaka",
            "odpt:railway": "odpt.Railway:Toei.Oedo",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "E-05",
            "odpt:stationTitle": {
              "en": "Ushigome-kagurazaka",
              "ja": "牛込神楽坂"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.UshigomeKagurazaka"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Oedo.UshigomeKagurazaka.InnerLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.UshigomeKagurazaka.InnerLoop.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Oedo.UshigomeKagurazaka.OuterLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.UshigomeKagurazaka.OuterLoop.SaturdayHoliday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CC4",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.699501,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "牛込柳町",
            "geo:long": 139.72504,
            "owl:sameAs": "odpt.Station:Toei.Oedo.UshigomeYanagicho",
            "odpt:railway": "odpt.Railway:Toei.Oedo",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "E-04",
            "odpt:stationTitle": {
              "en": "Ushigome-yanagicho",
              "ja": "牛込柳町"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.UshigomeYanagicho"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Oedo.UshigomeYanagicho.InnerLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.UshigomeYanagicho.InnerLoop.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Oedo.UshigomeYanagicho.OuterLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.UshigomeYanagicho.OuterLoop.SaturdayHoliday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CC3",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.699188,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "若松河田",
            "geo:long": 139.718043,
            "owl:sameAs": "odpt.Station:Toei.Oedo.WakamatsuKawada",
            "odpt:railway": "odpt.Railway:Toei.Oedo",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "E-03",
            "odpt:stationTitle": {
              "en": "Wakamatsu-kawada",
              "ja": "若松河田"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.WakamatsuKawada"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Oedo.WakamatsuKawada.InnerLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.WakamatsuKawada.InnerLoop.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Oedo.WakamatsuKawada.OuterLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.WakamatsuKawada.OuterLoop.SaturdayHoliday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CDA",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.683505,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "代々木",
            "geo:long": 139.701603,
            "owl:sameAs": "odpt.Station:Toei.Oedo.Yoyogi",
            "odpt:railway": "odpt.Railway:Toei.Oedo",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "E-26",
            "odpt:stationTitle": {
              "en": "Yoyogi",
              "ja": "代々木"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Yoyogi"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Oedo.Yoyogi.InnerLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.Yoyogi.InnerLoop.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Oedo.Yoyogi.OuterLoop.Weekday",
              "odpt.StationTimetable:Toei.Oedo.Yoyogi.OuterLoop.SaturdayHoliday"
            ],
            "odpt:connectingRailway": [
              "odpt.Railway:JR-East.ChuoSobuLocal",
              "odpt.Railway:JR-East.Yamanote"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CAD",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.692402,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "曙橋",
            "geo:long": 139.722317,
            "owl:sameAs": "odpt.Station:Toei.Shinjuku.Akebonobashi",
            "odpt:railway": "odpt.Railway:Toei.Shinjuku",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "S-03",
            "odpt:stationTitle": {
              "en": "Akebonobashi",
              "ja": "曙橋"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Akebonobashi"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Shinjuku.Akebonobashi.Westbound.Weekday",
              "odpt.StationTimetable:Toei.Shinjuku.Akebonobashi.Westbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Shinjuku.Akebonobashi.Eastbound.Weekday",
              "odpt.StationTimetable:Toei.Shinjuku.Akebonobashi.Eastbound.SaturdayHoliday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CBA",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.689959,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "東大島",
            "geo:long": 139.847255,
            "owl:sameAs": "odpt.Station:Toei.Shinjuku.HigashiOjima",
            "odpt:railway": "odpt.Railway:Toei.Shinjuku",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "S-16",
            "odpt:stationTitle": {
              "en": "Higashi-ojima",
              "ja": "東大島"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.HigashiOjima"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Shinjuku.HigashiOjima.Westbound.Weekday",
              "odpt.StationTimetable:Toei.Shinjuku.HigashiOjima.Westbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Shinjuku.HigashiOjima.Eastbound.Weekday",
              "odpt.StationTimetable:Toei.Shinjuku.HigashiOjima.Eastbound.SaturdayHoliday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CAE",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.69153,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "市ヶ谷",
            "geo:long": 139.737588,
            "owl:sameAs": "odpt.Station:Toei.Shinjuku.Ichigaya",
            "odpt:railway": "odpt.Railway:Toei.Shinjuku",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "S-04",
            "odpt:stationTitle": {
              "en": "Ichigaya",
              "ja": "市ヶ谷"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Ichigaya"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Shinjuku.Ichigaya.Westbound.Weekday",
              "odpt.StationTimetable:Toei.Shinjuku.Ichigaya.Westbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Shinjuku.Ichigaya.Eastbound.Weekday",
              "odpt.StationTimetable:Toei.Shinjuku.Ichigaya.Eastbound.SaturdayHoliday"
            ],
            "odpt:connectingRailway": [
              "odpt.Railway:JR-East.ChuoSobuLocal",
              "odpt.Railway:TokyoMetro.Namboku",
              "odpt.Railway:TokyoMetro.Yurakucho"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CB8",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.689391,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "西大島",
            "geo:long": 139.826231,
            "owl:sameAs": "odpt.Station:Toei.Shinjuku.NishiOjima",
            "odpt:railway": "odpt.Railway:Toei.Shinjuku",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "S-14",
            "odpt:stationTitle": {
              "en": "Nishi-ojima",
              "ja": "西大島"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.NishiOjima"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Shinjuku.NishiOjima.Westbound.Weekday",
              "odpt.StationTimetable:Toei.Shinjuku.NishiOjima.Westbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Shinjuku.NishiOjima.Eastbound.Weekday",
              "odpt.StationTimetable:Toei.Shinjuku.NishiOjima.Eastbound.SaturdayHoliday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CB2",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.695607,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "岩本町",
            "geo:long": 139.775115,
            "owl:sameAs": "odpt.Station:Toei.Shinjuku.Iwamotocho",
            "odpt:railway": "odpt.Railway:Toei.Shinjuku",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "S-08",
            "odpt:stationTitle": {
              "en": "Iwamotocho",
              "ja": "岩本町"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Iwamotocho"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Shinjuku.Iwamotocho.Westbound.Weekday",
              "odpt.StationTimetable:Toei.Shinjuku.Iwamotocho.Westbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Shinjuku.Iwamotocho.Eastbound.Weekday",
              "odpt.StationTimetable:Toei.Shinjuku.Iwamotocho.Eastbound.SaturdayHoliday"
            ],
            "odpt:connectingRailway": [
              "odpt.Railway:JR-East.ChuoSobuLocal",
              "odpt.Railway:JR-East.KeihinTohokuNegishi",
              "odpt.Railway:JR-East.Yamanote",
              "odpt.Railway:MIR.TsukubaExpress",
              "odpt.Railway:TokyoMetro.Hibiya"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CB0",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.695972,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "神保町",
            "geo:long": 139.757981,
            "owl:sameAs": "odpt.Station:Toei.Shinjuku.Jimbocho",
            "odpt:railway": "odpt.Railway:Toei.Shinjuku",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "S-06",
            "odpt:stationTitle": {
              "en": "Jimbocho",
              "ja": "神保町"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Shinjuku.Jimbocho"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Shinjuku.Jimbocho.Westbound.Weekday",
              "odpt.StationTimetable:Toei.Shinjuku.Jimbocho.Westbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Shinjuku.Jimbocho.Eastbound.Weekday",
              "odpt.StationTimetable:Toei.Shinjuku.Jimbocho.Eastbound.SaturdayHoliday"
            ],
            "odpt:connectingRailway": [
              "odpt.Railway:Toei.Mita",
              "odpt.Railway:TokyoMetro.Hanzomon"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CAF",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.695546,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "九段下",
            "geo:long": 139.751738,
            "owl:sameAs": "odpt.Station:Toei.Shinjuku.Kudanshita",
            "odpt:railway": "odpt.Railway:Toei.Shinjuku",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "S-05",
            "odpt:stationTitle": {
              "en": "Kudanshita",
              "ja": "九段下"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Kudanshita"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Shinjuku.Kudanshita.Westbound.Weekday",
              "odpt.StationTimetable:Toei.Shinjuku.Kudanshita.Westbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Shinjuku.Kudanshita.Eastbound.Weekday",
              "odpt.StationTimetable:Toei.Shinjuku.Kudanshita.Eastbound.SaturdayHoliday"
            ],
            "odpt:connectingRailway": [
              "odpt.Railway:TokyoMetro.Hanzomon",
              "odpt.Railway:TokyoMetro.Tozai"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CBD",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.69351,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "瑞江",
            "geo:long": 139.8977,
            "owl:sameAs": "odpt.Station:Toei.Shinjuku.Mizue",
            "odpt:railway": "odpt.Railway:Toei.Shinjuku",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "S-19",
            "odpt:stationTitle": {
              "en": "Mizue",
              "ja": "瑞江"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Mizue"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Shinjuku.Mizue.Westbound.Weekday",
              "odpt.StationTimetable:Toei.Shinjuku.Mizue.Westbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Shinjuku.Mizue.Eastbound.Weekday",
              "odpt.StationTimetable:Toei.Shinjuku.Mizue.Eastbound.SaturdayHoliday"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CB5",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.687982,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "森下",
            "geo:long": 139.796623,
            "owl:sameAs": "odpt.Station:Toei.Shinjuku.Morishita",
            "odpt:railway": "odpt.Railway:Toei.Shinjuku",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "S-11",
            "odpt:stationTitle": {
              "en": "Morishita",
              "ja": "森下"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Shinjuku.Morishita"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Shinjuku.Morishita.Westbound.Weekday",
              "odpt.StationTimetable:Toei.Shinjuku.Morishita.Westbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Shinjuku.Morishita.Eastbound.Weekday",
              "odpt.StationTimetable:Toei.Shinjuku.Morishita.Eastbound.SaturdayHoliday"
            ],
            "odpt:connectingRailway": [
              "odpt.Railway:Toei.Oedo"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CB1",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.695005,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "小川町",
            "geo:long": 139.766449,
            "owl:sameAs": "odpt.Station:Toei.Shinjuku.Ogawamachi",
            "odpt:railway": "odpt.Railway:Toei.Shinjuku",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "S-07",
            "odpt:stationTitle": {
              "en": "Ogawamachi",
              "ja": "小川町"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Ogawamachi"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Shinjuku.Ogawamachi.Westbound.Weekday",
              "odpt.StationTimetable:Toei.Shinjuku.Ogawamachi.Westbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Shinjuku.Ogawamachi.Eastbound.Weekday",
              "odpt.StationTimetable:Toei.Shinjuku.Ogawamachi.Eastbound.SaturdayHoliday"
            ],
            "odpt:connectingRailway": [
              "odpt.Railway:TokyoMetro.Chiyoda",
              "odpt.Railway:TokyoMetro.Marunouchi"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CAC",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.691016,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "新宿三丁目",
            "geo:long": 139.706794,
            "owl:sameAs": "odpt.Station:Toei.Shinjuku.ShinjukuSanchome",
            "odpt:railway": "odpt.Railway:Toei.Shinjuku",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "S-02",
            "odpt:stationTitle": {
              "en": "Shinjuku-sanchome",
              "ja": "新宿三丁目"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.ShinjukuSanchome"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Shinjuku.ShinjukuSanchome.Westbound.Weekday",
              "odpt.StationTimetable:Toei.Shinjuku.ShinjukuSanchome.Westbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Shinjuku.ShinjukuSanchome.Eastbound.Weekday",
              "odpt.StationTimetable:Toei.Shinjuku.ShinjukuSanchome.Eastbound.SaturdayHoliday"
            ],
            "odpt:connectingRailway": [
              "odpt.Railway:TokyoMetro.Fukutoshin",
              "odpt.Railway:TokyoMetro.Marunouchi"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CAB",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.688433,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "新宿",
            "geo:long": 139.698418,
            "owl:sameAs": "odpt.Station:Toei.Shinjuku.Shinjuku",
            "odpt:railway": "odpt.Railway:Toei.Shinjuku",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "S-01",
            "odpt:stationTitle": {
              "en": "Shinjuku",
              "ja": "新宿"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Shinjuku.Shinjuku"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Shinjuku.Shinjuku.Eastbound.Weekday",
              "odpt.StationTimetable:Toei.Shinjuku.Shinjuku.Eastbound.SaturdayHoliday"
            ],
            "odpt:connectingRailway": [
              "odpt.Railway:JR-East.ChuoRapid",
              "odpt.Railway:JR-East.ChuoSobuLocal",
              "odpt.Railway:JR-East.SaikyoKawagoe",
              "odpt.Railway:JR-East.ShonanShinjuku",
              "odpt.Railway:JR-East.Yamanote",
              "odpt.Railway:Keio.Keio",
              "odpt.Railway:Keio.KeioNew",
              "odpt.Railway:Odakyu.Odawara",
              "odpt.Railway:Seibu.Shinjuku",
              "odpt.Railway:Toei.Oedo",
              "odpt.Railway:TokyoMetro.Marunouchi"
            ]
          },
          {
            "@id": "urn:ucode:_00001C00000000000001000003102CB7",
            "@type": "odpt:Station",
            "dc:date": "2021-08-17T10:00:00+09:00",
            "geo:lat": 35.68904,
            "@context": "http://vocab.odpt.org/context_odpt.jsonld",
            "dc:title": "住吉",
            "geo:long": 139.815723,
            "owl:sameAs": "odpt.Station:Toei.Shinjuku.Sumiyoshi",
            "odpt:railway": "odpt.Railway:Toei.Shinjuku",
            "odpt:operator": "odpt.Operator:Toei",
            "odpt:stationCode": "S-13",
            "odpt:stationTitle": {
              "en": "Sumiyoshi",
              "ja": "住吉"
            },
            "odpt:passengerSurvey": [
              "odpt.PassengerSurvey:Toei.Sumiyoshi"
            ],
            "odpt:stationTimetable": [
              "odpt.StationTimetable:Toei.Shinjuku.Sumiyoshi.Westbound.Weekday",
              "odpt.StationTimetable:Toei.Shinjuku.Sumiyoshi.Westbound.SaturdayHoliday",
              "odpt.StationTimetable:Toei.Shinjuku.Sumiyoshi.Eastbound.Weekday",
              "odpt.StationTimetable:Toei.Shinjuku.Sumiyoshi.Eastbound.SaturdayHoliday"
            ],
            "odpt:connectingRailway": [
              "odpt.Railway:TokyoMetro.Hanzomon"
            ]
          }
        ]
    """.trimIndent()

}

