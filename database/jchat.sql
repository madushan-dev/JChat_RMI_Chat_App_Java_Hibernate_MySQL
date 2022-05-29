-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 29, 2022 at 06:54 AM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `jchat`
--

-- --------------------------------------------------------

--
-- Table structure for table `files`
--

CREATE TABLE `files` (
  `id` int(11) NOT NULL,
  `chat_id` int(100) NOT NULL,
  `link` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `files`
--

INSERT INTO `files` (`id`, `chat_id`, `link`) VALUES
(1, 10, 'chat_log/10_.ser'),
(2, 11, 'chat_log/11_.ser'),
(3, 12, 'chat_log/12_.ser'),
(4, 13, 'chat_log/13_.ser'),
(5, 14, 'chat_log/14_.ser'),
(6, 15, 'chat_log/15_.ser'),
(7, 17, 'chat_log/17_.ser');

-- --------------------------------------------------------

--
-- Table structure for table `groups`
--

CREATE TABLE `groups` (
  `id` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `description` varchar(100) NOT NULL,
  `status` tinyint(1) NOT NULL DEFAULT 0,
  `created_date` date DEFAULT NULL,
  `created_time` time DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `groups`
--

INSERT INTO `groups` (`id`, `name`, `description`, `status`, `created_date`, `created_time`) VALUES
(12, 'ICT Dep Group', 'Official students group of ICT Department', 0, '2022-05-21', '07:47:17'),
(15, 'ET Dep Group', 'Official students group of ET Department', 0, '2022-05-21', '13:35:43'),
(16, 'BST Dep Group', 'Official students group of BST Department', 0, '2022-05-21', '13:35:43');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `username` varchar(100) NOT NULL,
  `nickname` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `profile_image` longblob DEFAULT NULL,
  `user_type` varchar(10) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `username`, `nickname`, `email`, `profile_image`, `user_type`, `password`) VALUES
(1, 'admin', 'madushan', 'madushangunarathne@gmail.com', 0xffd8ffe000104a46494600010200000100010000ffdb004300080606070605080707070909080a0c140d0c0b0b0c1912130f141d1a1f1e1d1a1c1c20242e2720222c231c1c2837292c30313434341f27393d38323c2e333432ffdb0043010909090c0b0c180d0d1832211c213232323232323232323232323232323232323232323232323232323232323232323232323232323232323232323232323232ffc00011080078007803012200021101031101ffc4001f0000010501010101010100000000000000000102030405060708090a0bffc400b5100002010303020403050504040000017d01020300041105122131410613516107227114328191a1082342b1c11552d1f02433627282090a161718191a25262728292a3435363738393a434445464748494a535455565758595a636465666768696a737475767778797a838485868788898a92939495969798999aa2a3a4a5a6a7a8a9aab2b3b4b5b6b7b8b9bac2c3c4c5c6c7c8c9cad2d3d4d5d6d7d8d9dae1e2e3e4e5e6e7e8e9eaf1f2f3f4f5f6f7f8f9faffc4001f0100030101010101010101010000000000000102030405060708090a0bffc400b51100020102040403040705040400010277000102031104052131061241510761711322328108144291a1b1c109233352f0156272d10a162434e125f11718191a262728292a35363738393a434445464748494a535455565758595a636465666768696a737475767778797a82838485868788898a92939495969798999aa2a3a4a5a6a7a8a9aab2b3b4b5b6b7b8b9bac2c3c4c5c6c7c8c9cad2d3d4d5d6d7d8d9dae2e3e4e5e6e7e8e9eaf2f3f4f5f6f7f8f9faffda000c03010002110311003f00f9fe8a28a0028a28a005556760aa0b3138000c926bbcf0ff00c3a7ba48ee75798c311208863fbec38ebe99e47f8d1e01d1236ff89bce03156c423d08ce4ff9fcfa8af416b8001666c01c926b8abe21a7cb13a69524d5e454b0f0b787f4ef28c3a644f24472b24ac598f3df9c1f4e9d2b53c8b2ff009f1b3ffc074ff0a81a3d47ec4d7e9a75c358272f718030b80772afde65e73b80c63279c537ceae37293d5b3a124ba15b50f0ce83a9f986e34d85649319961ca30c63a761d3d2b83f12fc3f934f492ef49792e6dd41668987ce8327f3c0c7e47dabd17cea04e41c83570ad383d1912a7191e0345761e38d00595dff0068db2016f337ceaab80ac73e9c63f2fc6b8faf4e13538f3238e5171766145145592145145001451450014e8e3696458d065dc8551ea4d36ac69fff00212b5ffaec9fcc527a2047af58a259d8416e8bb56340bb739c5769e18f0d5bea5691ea3a9466486421a0b76040201e19877071c0e983939cf1ccf86f4f4d675c8ad6520c08a669573f7954818fc4919f6cd7af25789296a7ad4e175764e82bcdbc4fe1bbad1eee4bbb485a5d32525f11a736a7192081d13a907a0e871c13e94953a9e2ae28533c304e08041041e4114be757aa6a7e10d0f529649a5b3f2e7901ccb0398cee393b8807696c9ea41cf7cd6741e03d0a04226865bc639f9ae24e808c630b81dce0e3209ebc0c0d244a8b67956bd6c352d16e6dc852db772162400c39078af22af70f14e98744d4ee6d038689d0cb0e3395462c029cf5230467b8c1ef5e1f5db837a347262159a0a28a2bb0e70a28a2800a28a2800a96d65586ee195812a8eac71d700e6a2a2803e93f8671a49a5de5fabeef3a558f00e461572083ff00033f9577a86bce7e0d5dc171e0248628cac96f71224c4a81b989dc0fbfcaca39f4af44535e0555cb51a3dba7ad34cb2a6a50d5595aa40d5519132892b3542e682d51b351290e31383f8a10c6348b4bc672ad1cad17278daca4927fef81fad7cd35f4c7c5991a3f873a9b21c12625fc0c8a0fe86be67aefc0eb06ce1c6ab4d0514515dc718514514005145140051451401ec3f02f572b73a9e8cf21daea2e624da3008f95ce7af74e3dabdaabe45d07589f40d76cf55b71992da40db78f997a32e4838c824671c66beaed2b54b4d674c8350b19965b799772329fd3d88e983c8af1f1d49c67ceb667ab83a9cd0e5ea8be1a9fbaa1a5cd71a91d4d1216a616a4cd56bebd834eb0b8bdba7d96f6f1b4b23609c281927039345db0b58f29f8e9ac22d869ba3230324921b9931272aaa36a82be84b1c1ff0064fe1e255b5e2cf104be27f125dea921611c8db6146cfc918e1463271c724038c9358b5ef61e9fb3a6a2cf1b1153da546d6c1451456c6214514500145145001453a38e495b6c68ce719c28cd6ad8f8635ad44235b69f3b231c07d8703b73e9d280322bd4be0a5fea316b77f6b1bca74ef23cc91319412ee50a73d891bbeb8ef8e30edbe1a6a6c09bcbbb3b621b050c9bc9ff00be738efdbb57aa781743d37c3da7cf6967399ee247f3269590296e3000e33b47bf724f19ae6c5bfdd3d0e9c22fdead4ef23b88e4fe2c1f46e2a5acaeb4a22cff0008af1794f5ee8d09278e3cee6191d875af22f8dba86a3fd9ba65bc4f2a584cefe7aa0f95986d2818ff00df440f6cf6af4d2a57b5725e3fd1a1d7f4682c64ba16ecb379c84824310ac31c038fbd5be155aac4c710ef4a47ceb4576773f0db558d54dadcda5d13fdc902fe8d839fc2b12f7c2badd82c8f71a74eb1a1c19361dbf81ef5ee1e298f453e48658b1e646e99e9b948cd32800a28a2800aed7c33e15824892f7534620f2b01e323dffcf7edd6b97d26d7ed9aa410904a96cb6067007afb57a78942a85500003000ed4017add6d6cfcbfb2dadbc2631852b102476ea726a67bb7931be466c74c9cd6679def479def401a3e7fbd4b6da84b693acd13e1876ec47a1ac9f3bde8f3bde9349ab31a6d3ba3beb0f15d9328176ad13e3960b9527dbbd6dff006ce92b19637f0640ce378cd79379def479def5c8f070be9a1d4b172b6aae7a0def8b6c10116c924cd8c8246d1f4e7fc2b95bad425bc9da699b2c7f203d056479def479def5b52a10a7aadccaa579d4d1ec68f9def4e4bb78f3b2465cf5da48cd6679def479def5b1897ae4c17a185ddbc33ee5d84c918248f4cf5fd6b81f14f8662b256bdd3d48b7eaf1f5d9ff00d6ff003f5ec3cef7a8e7f2ee2078650191d4a90466803c9a8a9ef2ddad2f26818105188e4e78ed45006b785a33fda124c08c22608fafff00aabaff003bdeb8ff000e3ec6b93ecbfd6b7fcff7a00d1f3bde8f3bdeb3bcff007a3cff007a00d1f3bde8f3bdeb3bcff7a3cff7a00d1f3bde8f3bdeb3bcff007a3cff007a00d1f3bde8f3bdeb3bcff7a3cff7a00d1f3bde8f3bdeb3bcff007a3cff007a00d1f3bde8f3bdeb3bcff7a3cff7a00e6bc471aa6aeecb9f9d431cfad152788954cf0ca3ef32907f0fff005d14018b4514500145145001451450014514500145145001451450014514500145145007ffd9, 'admin', '1234'),
(7, 'dashini', 'dashini_sandu', 'dashini@gmail.com', 0xffd8ffe000104a46494600010200000100010000ffdb004300080606070605080707070909080a0c140d0c0b0b0c1912130f141d1a1f1e1d1a1c1c20242e2720222c231c1c2837292c30313434341f27393d38323c2e333432ffdb0043010909090c0b0c180d0d1832211c213232323232323232323232323232323232323232323232323232323232323232323232323232323232323232323232323232ffc00011080078007803012200021101031101ffc4001f0000010501010101010100000000000000000102030405060708090a0bffc400b5100002010303020403050504040000017d01020300041105122131410613516107227114328191a1082342b1c11552d1f02433627282090a161718191a25262728292a3435363738393a434445464748494a535455565758595a636465666768696a737475767778797a838485868788898a92939495969798999aa2a3a4a5a6a7a8a9aab2b3b4b5b6b7b8b9bac2c3c4c5c6c7c8c9cad2d3d4d5d6d7d8d9dae1e2e3e4e5e6e7e8e9eaf1f2f3f4f5f6f7f8f9faffc4001f0100030101010101010101010000000000000102030405060708090a0bffc400b51100020102040403040705040400010277000102031104052131061241510761711322328108144291a1b1c109233352f0156272d10a162434e125f11718191a262728292a35363738393a434445464748494a535455565758595a636465666768696a737475767778797a82838485868788898a92939495969798999aa2a3a4a5a6a7a8a9aab2b3b4b5b6b7b8b9bac2c3c4c5c6c7c8c9cad2d3d4d5d6d7d8d9dae2e3e4e5e6e7e8e9eaf2f3f4f5f6f7f8f9faffda000c03010002110311003f00f9fe8a28a0028a29f144d34ab1a0cb31c0a007dbdb4b7526c8973ea7b0fad6cdbe8d047cca4cade9d055cb5b75b5b758979c724e3a9a9a98ae3238a38b3e5c6899ebb540cd3eacc3a7de5c22bc36b3ba374658c907f1ab9ff08deadff3e9ff009113fc6a5ce2b76691a1566af18b7f2663c90c529064891c8e9b941aa33e8d6f20cc65a26f6e47e55b33585e5ba33cd6b3a22f5668c803f1aaf4d34f62251945d9ab1cadd59cd68f891783d1874350575d34293c2d138cab0e6b97bab76b5b8689b9c720e3a8a044345145030a28a2800a28a2800ad5d120dd349311f746d5e3b9ff003fad655741a3215b1c9e8ce48fd07f4a019ab0412dcce90c285e4738551debb1b2d074ed2e259afe489e53c132b0080f3c007afe3e9dab96b2d465d395dad8059dc6d329e70b9070074edd4e7f0ef5a59649a4324b2348e7ab39c93f8d6738ca5a5ec8ebc3d6a3417338f34bcf65fe6ceedfc4da52216170ce47f0ac6d93f98aadff00097e9fff003c6e7fef95ff00e2ab8c8e379a548a246791c85555192c4f4007735d87fc2b6d6ffb1fed784fb5efc7d9370cedf5dd9c67dbd3be78ac9d1a51f899d3fda98a9fc297dc5c4f13694e809b8284ff000b46d91f90c556bdd034ed52269b4f922490719888284e07040e9f87af7ae3248de195e2951924425595860a91d411d8d2c52c9048248a478dc74643822a950e5d60c4f33f6ab96bc135f73167825b69de1990a48870ca7b5626b91031c537190769e3af7fe87f3ae8ef7507d4023dc20370bc79abc6e5e7823a67dc63f1ac6d594369d2123254823db9add5eda9e6cd454bdc7a1cdd145140828a28a0028a28a002ba4d0c3dc5a470c48cf26fd8aaa325893c003bf5ae6ebaaf02ddc707882c7ce758e38eee29599b8c2871b893e830286ec82d73d007c2ad74a83f6ad3c12390647e3ff1cad5b2f84aa191afb542cb8f9d208f041f6639fe55e994579ef1151f53b55082e86368be16d27415cd95b012950ad2b9dcedf89e99c038181ed5b34515936dbbb35492d1189ad785348d7b0d796dfbe0855654255973f4eb8ec0e47b57177ff0988f35ec353180331c73c7f9e587e3fc35e9f4d7ff0056df43551ab38ecc99538cb7478d37c32d6d51985c58b10321448d93edcad79feb5986ca48e456572c13691820839c1fc8d7d335f35f8daee3b8d66eda16578e5bb965561dd771c1fc735d742aca77b9cd5a94616b1cb514515d0601451450014514500156f4d97cabf88f3863b481df3c7f3c554a01c1c8a00fa53c01e2f7d721feccbb43f6bb680379c5cb79ca0e0939e84657b9ce49aedebc1bc13ac0d17c536b348e12de6fdc4c4e000add0927a00c1493e82bde6bcfaf0e596876d09f34750a28a2b1360a8e63888d4955ee1b90bf8d0070fe3af153e8d00d3ad4117773116f343153129380471c9386ee318cd7806a9379b7f260e427c838f4ebfae6bd0bc61a9a6abe27bb9e290c902111447208c28c1c63b13923eb5e6f77ff001f93e7af98dfcebd1a305082382acf9a4c868a28ad4cc28a28a0028a28a002a6b483ed3751c5d89e7e9dea1ab3677af66ecc888dbb00961ce3da803a8af66f0278c22d66ce3d36f1b66a30205059b3e7a81f78679dd81c8fc7d40f08b3d51af6e12de2b39e59e4388e3857cc663e8075af5af87de0aba5ba8b5ad5eda4b6f2ceeb7b59946f271f7d873b719e075c8cf18e71afcae3ef1ad1e652d0f51a29ac59790bb87a0eb4c33a81c2c87dbcb3fe15e79dc3dd822926b85f1bf8b1349b57b1b66dd7f3a10595b1e4a91f7b8e777a7e7ec7af67691b2c31ec7b579af8efc1d74f7326afa55b3dcf99f34f6d101b81039651c6ece39032727be78d28a8b9fbc67579947dd3cf2b99d4a2f2afe51ce18ee04f7cf3fcf35a57baa4f677125b4965241321c149c15653eebd4564dd5d4977207936e40c00a318af48f3ed620a28a28185145140054d6b6b3dedd476d6d134b34870a8bdff00cfad435eade0dd0e0d374886ecaab5ddd461da4eb853c851e9c633efeb8159d4a9c8ae756130cf115397a7530f4cf87523aa49a9ddf979e5a18464818fef1e01cf5e08e3af35d25af83b42b531b0b212ba0c6e998b6ee3a95276fe95bb4571caace5d4fa2a581a14d691bfaea4fa058c306a7690da5bc50a79c1ca4681471c9381ec2bd26bcff439443ad5ab1e85f6fe608feb5e815933931cad3496d60a28a291c231a257e48e7d45466dff00badf9d4f4500799f88f4d89b55ba82e218e78cbefdb228619233d0fd6b98baf0968972d233592c6ee319898a6de3190a0e33f8576de20757d72e4a90465471ea1403596ca1ba8aa4dad99edc6942a538f3c53d11e77a8fc3f9115e4d3aebccc72219860918fef0e09cfb01cf5ae3ae6da6b3b992dee2368e68ce195bb57b732ed38ae73c5da2c3a8e9335d050b756d19757ce32a392a7d78ce3dfea6b7a58877b48f3f1796c395ce968d743cbe8a28aed3c12ce9f6c2f352b5b5662ab34c91961d464819fd6bdcabc73c296a2f3c51a7c4491b64f37207f7017ffd96bd8eb8f12f548f7b278fb929798514515ce7b04904cd6f7114ca0168dc3807a641cd7a547224d124b19ca3a8653ea0d798d755e1cd694c696172d861c44e4f5ff67ebe9f97d533871b49ca2a4ba1d35145148f28291d95119dd82aa8c924e0014b5cdf88f595589ec2dd833b712ba9fba3baf1dfd7da834a54dd4928a398b99bed17534fb76f98ecf8ce71939a8a8a2a8f7d2b2b11ca3806a2a9e4fb86a0a960789de5b9b3beb8b62c18c32346580eb838cd15a3e28b65b5f135f46a58832799cfab00c7f53457ab177499f19523c9371eccafa26b379e1fd66db54b0655b9b762577aee520820823d08247af3c60d7a3da7c72d44aca9aae8763771b01b56176880faeedf9fd28a2a654e32dd046728fc2c47f89da15e4524b2691796371bbe58e091668d877249da54fb004715245e38d024895daede262394785f2bf5c023f5a28acde1e076d3ccebc15b7f53422f1068d2c4b22ea96815864069954fe209c8fc6addb5eda5e8636b750ce17ef18a40d8fae28a2b9e74d4763d7a18a9d46934b536acb5ebfb24089209230301241903f1ebfad5bff84b6fff00e78db7fdf2dfe3451589d52a14e4eee255bcf106a178851a41146460ac4319fc7afeb58573a8d8d9b84babcb781c8c8596555247e268a2aa114dd88a8d5187b88ab3f88f46b784cafa9da951da39039fc9726b3e7f1ce831425d2e649987f04713027fefa007eb4515d30a116aecf2abe675a12e5497f5f3221f13744b54478b47bbbe94e772cf22c289e98c6eddf8e07b532ebe34dfaac69a5e8b656b1ae772cacd203f4dbb31dfd68a2b45429f63cfa98bad51de4cf3dd6757bbd7b57b8d4ef995ae27605b62ed000000007a0000f5e39cd14515b256d0e66ee7ffd9, 'normal', '1234'),
(8, 'vishalini', 'vishalini', 'vishalini@gmail.com', 0xffd8ffe000104a46494600010200000100010000ffdb004300080606070605080707070909080a0c140d0c0b0b0c1912130f141d1a1f1e1d1a1c1c20242e2720222c231c1c2837292c30313434341f27393d38323c2e333432ffdb0043010909090c0b0c180d0d1832211c213232323232323232323232323232323232323232323232323232323232323232323232323232323232323232323232323232ffc00011080078007803012200021101031101ffc4001f0000010501010101010100000000000000000102030405060708090a0bffc400b5100002010303020403050504040000017d01020300041105122131410613516107227114328191a1082342b1c11552d1f02433627282090a161718191a25262728292a3435363738393a434445464748494a535455565758595a636465666768696a737475767778797a838485868788898a92939495969798999aa2a3a4a5a6a7a8a9aab2b3b4b5b6b7b8b9bac2c3c4c5c6c7c8c9cad2d3d4d5d6d7d8d9dae1e2e3e4e5e6e7e8e9eaf1f2f3f4f5f6f7f8f9faffc4001f0100030101010101010101010000000000000102030405060708090a0bffc400b51100020102040403040705040400010277000102031104052131061241510761711322328108144291a1b1c109233352f0156272d10a162434e125f11718191a262728292a35363738393a434445464748494a535455565758595a636465666768696a737475767778797a82838485868788898a92939495969798999aa2a3a4a5a6a7a8a9aab2b3b4b5b6b7b8b9bac2c3c4c5c6c7c8c9cad2d3d4d5d6d7d8d9dae2e3e4e5e6e7e8e9eaf2f3f4f5f6f7f8f9faffda000c03010002110311003f00f9fe8a28a0029c88f23aa22b33b1c0551924d5dd2749b8d5ee84508da83992523841fd4fa0af40d2b45b4d263fdca6e988c3cadf79bfc07b0f415a429b91855af1a7a75393d3fc1f7b749e65cb8b54232a186e63d3a8cf1f89cf1d2ba3b4f0ae956b826169d836434cd9fc303008fa8adaa2ba234e28e09e22a4ba91416b6f6a08b78228437511a05cfe552d359d5065d828f52714cfb4c1ff003da3ff00be855394568d99a8ce5aa57127b5b7ba005c5bc5281d3cc40d8fceb2eefc2ba55d64885a062d92d0b63f0c1c803e82b615d5c651830f50734ea1a8c814a707a3b1c0ea1e0fbdb54f32d9c5d201960a36b0ebd0679fc0e79e95cfba3c6ec8eacaea7055860835ebd59daae8b69ab47fbe4db30184957ef2ff0088f63ea6b29515f64eaa78b6b499e61455fd5b49b8d22e8c530dc8798e503871fd0fa8aa15ced34eccef525257414514521855fd27499f57bb10c4308b832487a20ff1f4154911a4915114b3b101540c924f6af4dd174a4d274f587e53337cd2b8fe26ff0001d3ff00d75a53873330af57d9c74dcb161616fa6da2db5b26d45e493d58fa93eb5668a2bb12b1e536dbbb0aa57d7bf671b23c190ffe3b576b9c9a432ccf21cfcc73cd71e32b3a70b47767a19761a35aa372d908eed2396762cc7b9a6d1527d9e6fb37da7c993c8dfe5f9bb4eddd8cedcf4ce39c578cddf567d1a492b21a8ed1b86462ac3b8ad7b1bdfb40d9260483ff001eac6a7c3218a649067e539e2b7c3d79529791cb8bc2c6bc1e9af43a3a28a2bde3e58ad7f616fa95a35b5ca6e46e411d54fa83eb5e6fab6933e91766194651b263907471fe3ea2bd46b3b5ad29356d3da1f944cbf344e7f85bfc0f4fff005567521ccbccde85674dd9ec798514ae8d1bb23a9575386561820fa1a2b8cf54e8bc1fa7add6a4f73260a5b00429eec7383d3b609fae2bbdac5f0ada7d97418890c1a663290defc0c7b6003f8d6d576538da2793889f354614514568624571c5b4bfee1fe55811c6f2c8b1c68ceee42aaa8c924f40057576762752bb8ec83ecf38ec2de80f53f957a1e83a0db68966b124309994c8be7851bd90b92a19b00938db9ed915e466534a513dfc9e2dc25ea79fe89f0fb51bf649750ff43b638254ff00ad61ec3f87f1e9e86bd14f87f4a3a40d28d9a7d881cf97b8f5ce739ce73ef9ad2a2bc9726cf6d4523ca35bf87fa8d83c92e9ff00e996c092147fad51ee3bfe1d7d05723246f148d1c88c8e84ab2b0c104750457d0b591afe836dadd9b46f0c227631af9e546f540e0b056c120e3763b64d52a9dc970ec7985bf36d17fb83f954b53ded81d32f24b22fbfc93b437a8ec7f2a82bea29bbc1347c5554d4e49f76145145590705e30d3d6d7524b98f012e4125476618c9e9df20fd7345747e2ab4fb568329018b42c25017db839f6c127f0a2b8eac6d23d4c34f9a9fa1ab6b00b5b486dc36e1146a809ef818a968a2bb0f2dbb85145140089a8ae997d6770dbb093a3b05ebb4105b1f871f8d7b023ac88ae8c191865594e411ea2bc175272d7ac0e3e5000fe7fd6bb7f869aaaa9bad25f00b1f3e23ea70030ebe8148e3b357cfe3e6ea546fb687d565b4d52a2bcf53d168a2a97f6c69d8cfdb21fbdb3ef77e9f97bf4ae03d45194b645da4660aa59880a06492780296b8df1b5f8260d3d704a9f35cfa1e401fcff4adb0f45d6a8a08e5c562161e93a8ce62fee05dea37370bbb6c92b3aeeeb8278aaf4515f50924ac8f8c949c9b6c28a28a6222ba805d5a4d6e5b68963642476c8c5152d15328296e5c2ace1f0b21b59c5d59c170176896357c7a6466a6ac5f0addfdab418812c5a163112dedc8c7b6081f856d538bbab8a71e5934145145324c3d4548bd724704023f2a8ed2eee2c2ee3bab595a29e33b91d7b7f9f4ef5a3a9c1be212aae593ae3d2b22bc2c55370aaefd753ea7035554a11b74d3ee3db7c3dad43e24d184ae80498f2e78c8e338e71fec9a8ffe112d37cedf99f6eecf97bc6dc7a74ce3f1cd737f0f4ffa0dc91d8a8cfbe5bfc4576be7498c6eae3a91e49593edf91e8e1f113e5bad357f83688357d4e1d134d055577e36431f6ce38fc0579bdc5c4b7570f3cf21925739663deba4f1882459b72797c9ff00be6b96af672ea518d2e7eacf99cdabce75dd37b2ff0020a28a2bd03cb0a28a28021ba9c5ad9cf7057708a367c7ae0668acbf155dfd97419402c1a661102befc9cfb6011f8d15855a8e2ec8ecc3508ce379239bf07ea0b6ba93db4980972000c7b30ce075ef923eb8aefabc851da3915d18aba905581c10477af4dd17554d5b4f59be5132fcb2a0fe16ff0003d7ff00d5451969ca18ba767ce8d1ab7a6e977babdd8b5b0b769e62a5b68200007724f007d7d4554af7df0fe8d0e85a3c1651aaef55ccaea3efb9ea73dfdb3db15556a72232c3d0f6b2f2470fa57c2d69230fac5e6c0c3982dc02718eec4633d72307eb5e35786d4dfdcfd84c86d04ade4f99f7b664edcfbe315f4cf8af53fec7f0a6a97e26f2648addfca902e71211b538c1fe22bed5f2e27535e7d7bd48393e87b5858c68cb963d4f41f8757c365e69ec402089d060e4ff000b73d3fbbf9d7755e5de039da3f14c50246646b98de218ea38dd9c77fbb8fc6bd67ec179ff003e93ff00dfb35e5ca2ef7b1ebc64ad6b9c07c44d45ededec6d22701d9ccad83c8da3038f43b8fe55c5da6ad20be85ef19dedbcc1e72c6aa18ae79dbc601c74ed5adf1027693c55240f118dada2488e7a9c8df9c76fbd8fc2b97af5f0c9c292478f8a51a955b6ae7b86abf0ba44579349bdf331cac17030d8c73f38e09cf4e00e7af15c36a5a5dee91766d6fedda098286da482083dc11c11f4f435edde14d47fb5bc27a55e99ccef25b279b211c9900c3ffe3c1aa4f1068b0ebba3cf6722af9854986461f71fb1cf6f7c76cd6d0af24ed238eae0e2d5e1a33c0a8a2b3b5ad55349d3da6f94ccdf2c487f89bfc075ff00f5d75b7657679918b93b2392f186a0b75a925b478296c082c3bb1c6475ed803eb9a2b9e77691d9dd8b3b1cb331c927d4d15c327ccee7b14e0a11514255fd27569f48bb1344728d812467a38ff1f435428a1369dd1524a4accf6af07cb06bdace966dd04f149729e646cb9c004160c3d8673ed5f43d7c5be0ef15de7837c476dab5ac6b32c4c7ccb77621645208233d8e09c1ec7b11907ea7f05fc42d0fc71680e9f3f957c91ef9eca5e248f9c123b32e71c8f519c138a2acdcec4e1e92a775dccaf8c5792db781c45191b2eaee38a4c8fe1019f8fc516bc11485e6bd53e375fabea3a4e9cbbc3c513ceffdd21c855fc46c6fcebca6a7914a3666dcce32ba2de9b7efa6ead67a822076b59d26542700956071fa57d655f2157bb2f8848f819f6f117ce2c7ec5b449c839f237671d7f8b1f867bd128a49240a4db6d9e29aa5f36a7ab5eea0c8236ba9de6280e429662d8fd6aa514568667d07f08ef85df80e1842153673c90924e7764f999f6ff598fc2bbaaf1cf821a805b9d5b4d795cb3a25c471f3b4609573e80fcc9f5c7b5771e34f885a1f81ed09d427f36f9e3df05945cc9273804f655ce793e871923158c96a6a9e879078b2ead348d5b55924db14115dca888831fc470aa2bc9f56d5a7d5eeccd29c22e44718e883fc7d4d5ff1878aaebc61e22bad56e224b7595b31dbc672b1a8000fab600c9ee7b0180306b79d47256392950506e5d428a28accdc28a28a002a48279ad6e23b8b795e29a270f1c91b1564607208239041ef451401b975e31d5f549a39757b97bf922896149256f9c2af404f7ee7279249249353c1aada4e71e679679e24e3f5e94514d302da4892a6f8dd5d738ca9c8cd6bff006e49ff00089ff60792be5fdbbedbe6e79cf97b36e3d3bd145508c891d224df232a2671b98e067d2aa4faada4071e679878e23e7b7af4a28a4d81159f8d358d2649e4d22e1ac649e06824923c17d8d8c80c47ca781c8c118e0d60cf3cd757125c5c4af2cd2b97924918b33b1392493c924f7a28a9191d145140051451401fffd9, 'normal', '1234');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `files`
--
ALTER TABLE `files`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `groups`
--
ALTER TABLE `groups`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `files`
--
ALTER TABLE `files`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `groups`
--
ALTER TABLE `groups`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
