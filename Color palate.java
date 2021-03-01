module.exports = {

			env: {

			  browser: true,

			  es6: true,

			  node: true,

			},

			parser: '@typescript-eslint/parser',

			extends: [

			  'eslint:recommended',

			  'plugin:@typescript-eslint/eslint-recommended',

			  'plugin:@typescript-eslint/recommended',

			  'plugin:jest/recommended',

			  'plugin:cypress/recommended',

			  'plugin:prettier/recommended',

			],

			parserOptions: {

			  tsconfigRootDir: __dirname,
nithyanantham
53 minutes ago
THis one is we can use the #111


Reply

Edit

Delete

Like

Create task

			  project: ['./tsconfig.json'],

			},

			plugins: ['@typescript-eslint', 'cypress', 'chai-friendly', 'mocha', 'jest', 'react', 'graphql'],

			rules: {

			  'no-console': ['error', {allow: ['error']}],

			  '@typescript-eslint/explicit-function-return-type': 'off',

			  '@typescript-eslint/no-use-before-define': 'off',

			  '@typescript-eslint/no-var-requires': 'off',

			  '@typescript-eslint/no-unused-expressions': 'error',

		  

			  // unused variables

			  '@typescript-eslint/no-unused-vars': [

				'error',

				{

				  ignoreRestSiblings: true,

				  argsIgnorePattern: '^_',

				  varsIgnorePattern: '^_',

				},

			  ],

		  

			  'mocha/no-exclusive-tests': 'error',

		  

			  // race conditions

			  'require-atomic-updates': 'warn',

		  

			  // switch statements

			  'no-case-declarations': 'error',

		  

			  // lots of false positives

			  '@typescript-eslint/no-use-before-define': ['error', {functions: false, variables: false, classes: true}],

		  

			  // don't enforce interface names need to start with I

			  '@typescript-eslint/interface-name-prefix': 'off',

		  

			  // type inference and safety

			  '@typescript-eslint/no-non-null-assertion': 'off',

			  '@typescript-eslint/no-explicit-any': 'off',

		  

			  //formatting / style

			  'no-useless-escape': 'off',

			  '@typescript-eslint/camelcase': 'error',

			  'semi': 'error',

		  

			  // prefer const

			  'prefer-const': 'warn',

		  

			  // prefer rest params

			  'prefer-rest-params': 'warn',

		  

			  // empty blocks and error handling

			  '@typescript-eslint/no-empty-function': ['error', {allow: ['arrowFunctions']}],

		  

			  // typescript compiler errors

			  '@typescript-eslint/ban-ts-ignore': 'off',
