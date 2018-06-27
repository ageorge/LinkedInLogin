// Blockchain chat contract address
const ContractAddress = "0x9b62bd396837417ce319e2e5c8845a5a960010ea";
// Blockchain chat contract ABI
const ContractABI = [
	{
		"anonymous": false,
		"inputs": [
			{
				"indexed": true,
				"name": "previousOwner",
				"type": "address"
			},
			{
				"indexed": true,
				"name": "newOwner",
				"type": "address"
			}
		],
		"name": "OwnershipTransferred",
		"type": "event"
	},
	{
		"constant": false,
		"inputs": [],
		"name": "renounceOwnership",
		"outputs": [],
		"payable": false,
		"stateMutability": "nonpayable",
		"type": "function"
	},
	{
		"constant": false,
		"inputs": [
			{
				"name": "_newOwner",
				"type": "address"
			}
		],
		"name": "transferOwnership",
		"outputs": [],
		"payable": false,
		"stateMutability": "nonpayable",
		"type": "function"
	},
	{
		"constant": false,
		"inputs": [
			{
				"name": "_userEmail",
				"type": "string"
			},
			{
				"name": "_bio",
				"type": "string"
			}
		],
		"name": "updateUserBio",
		"outputs": [
			{
				"name": "",
				"type": "bool"
			}
		],
		"payable": false,
		"stateMutability": "nonpayable",
		"type": "function"
	},
	{
		"anonymous": false,
		"inputs": [
			{
				"indexed": true,
				"name": "_userEmail",
				"type": "string"
			}
		],
		"name": "UserEmailUpdate",
		"type": "event"
	},
	{
		"anonymous": false,
		"inputs": [
			{
				"indexed": true,
				"name": "_userEmail",
				"type": "string"
			},
			{
				"indexed": false,
				"name": "",
				"type": "string"
			}
		],
		"name": "UserBioUpdate",
		"type": "event"
	},
	{
		"anonymous": false,
		"inputs": [
			{
				"indexed": true,
				"name": "_userEmail",
				"type": "string"
			},
			{
				"indexed": false,
				"name": "",
				"type": "string"
			},
			{
				"indexed": false,
				"name": "",
				"type": "string"
			},
			{
				"indexed": false,
				"name": "",
				"type": "string"
			},
			{
				"indexed": false,
				"name": "",
				"type": "uint256"
			}
		],
		"name": "UserCertificationUpdate",
		"type": "event"
	},
	{
		"anonymous": false,
		"inputs": [
			{
				"indexed": true,
				"name": "_userEmail",
				"type": "string"
			},
			{
				"indexed": false,
				"name": "",
				"type": "string"
			},
			{
				"indexed": false,
				"name": "",
				"type": "string"
			},
			{
				"indexed": false,
				"name": "",
				"type": "uint256"
			}
		],
		"name": "UserEducationUpdate",
		"type": "event"
	},
	{
		"constant": false,
		"inputs": [
			{
				"name": "_userEmail",
				"type": "string"
			},
			{
				"name": "_certificationUrl",
				"type": "string"
			},
			{
				"name": "_certificationName",
				"type": "string"
			},
			{
				"name": "_certificationProvider",
				"type": "string"
			},
			{
				"name": "_yearOfCertification",
				"type": "uint16"
			}
		],
		"name": "updateUserCertification",
		"outputs": [
			{
				"name": "",
				"type": "bool"
			}
		],
		"payable": false,
		"stateMutability": "nonpayable",
		"type": "function"
	},
	{
		"anonymous": false,
		"inputs": [
			{
				"indexed": true,
				"name": "previousOwner",
				"type": "address"
			}
		],
		"name": "OwnershipRenounced",
		"type": "event"
	},
	{
		"constant": false,
		"inputs": [
			{
				"name": "_userEmail",
				"type": "string"
			},
			{
				"name": "_index",
				"type": "uint256"
			},
			{
				"name": "_nameOfIntitution",
				"type": "string"
			},
			{
				"name": "_yearOfPassing",
				"type": "uint16"
			}
		],
		"name": "updateUserEducation",
		"outputs": [
			{
				"name": "",
				"type": "bool"
			}
		],
		"payable": false,
		"stateMutability": "nonpayable",
		"type": "function"
	},
	{
		"constant": false,
		"inputs": [
			{
				"name": "_userEmail",
				"type": "string"
			}
		],
		"name": "UpdateUserEmail",
		"outputs": [
			{
				"name": "",
				"type": "bool"
			}
		],
		"payable": false,
		"stateMutability": "nonpayable",
		"type": "function"
	},
	{
		"constant": true,
		"inputs": [
			{
				"name": "_userEmail",
				"type": "string"
			}
		],
		"name": "getUserBio",
		"outputs": [
			{
				"name": "_bio",
				"type": "string"
			}
		],
		"payable": false,
		"stateMutability": "view",
		"type": "function"
	},
	{
		"constant": true,
		"inputs": [
			{
				"name": "_userEmail",
				"type": "string"
			}
		],
		"name": "getUserCertificationDetails",
		"outputs": [
			{
				"name": "_certificationUrl",
				"type": "string"
			},
			{
				"name": "_certificationName",
				"type": "string"
			},
			{
				"name": "_certificationProvider",
				"type": "string"
			},
			{
				"name": "_yearOfCertification",
				"type": "uint256"
			}
		],
		"payable": false,
		"stateMutability": "view",
		"type": "function"
	},
	{
		"constant": true,
		"inputs": [
			{
				"name": "_userEmail",
				"type": "string"
			}
		],
		"name": "getUserCollegeEducationDetails",
		"outputs": [
			{
				"name": "_nameOfIntitution",
				"type": "string"
			},
			{
				"name": "_yearOfPassing",
				"type": "uint256"
			},
			{
				"name": "_educatiodetailType",
				"type": "string"
			}
		],
		"payable": false,
		"stateMutability": "view",
		"type": "function"
	},
	{
		"constant": true,
		"inputs": [
			{
				"name": "_userEmail",
				"type": "string"
			}
		],
		"name": "getUserHSCeducationDetails",
		"outputs": [
			{
				"name": "_nameOfIntitution",
				"type": "string"
			},
			{
				"name": "_yearOfPassing",
				"type": "uint256"
			},
			{
				"name": "_educatiodetailType",
				"type": "string"
			}
		],
		"payable": false,
		"stateMutability": "view",
		"type": "function"
	},
	{
		"constant": true,
		"inputs": [
			{
				"name": "_userEmail",
				"type": "string"
			}
		],
		"name": "getUserSSCeducationDetails",
		"outputs": [
			{
				"name": "_nameOfIntitution",
				"type": "string"
			},
			{
				"name": "_yearOfPassing",
				"type": "uint256"
			},
			{
				"name": "_educatiodetailType",
				"type": "string"
			}
		],
		"payable": false,
		"stateMutability": "view",
		"type": "function"
	},
	{
		"constant": true,
		"inputs": [],
		"name": "owner",
		"outputs": [
			{
				"name": "",
				"type": "address"
			}
		],
		"payable": false,
		"stateMutability": "view",
		"type": "function"
	}
]
